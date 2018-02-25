package txc.xxy.ssm.shiro.ext.authc;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import com.n22.cs.comp.common.log.LogTool;
import com.n22.cs.comp.redis.JedisClient;
import com.n22.cs.comp.shiro.CustAuthenticationException;
import com.n22.cs.comp.shiro.ShiroConstant;
import com.n22.cs.comp.shiro.exceprion.SysManageException;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import txc.xxy.ssm.shiro.ext.common.enums.StatusEnum;
import txc.xyz.base.mapper.*;
import txc.xyz.base.model.BaseRole;
import txc.xyz.base.model.BaseUser;
import txc.xxy.ssm.shiro.ext.common.constant.RedisKeyConstant;
import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;
import txc.xyz.base.model.BaseUserRoleRela;
import txc.xyz.base.model.BaseUserRoleRelaExample;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * 扩展的 认证、鉴权类
 * 
 * @author xxx
 * @date 2016年4月14日 上午11:12:29
 * @version 1.0
 */
public class UserRealm extends AuthorizingRealm {
	
	// 用户对应角色数据有效期
	private static final int expired = 1 * 60 * 60;
	// 初始化标识符
	private boolean initFlag = false;

	@Autowired
	private JedisClient jedisClient;
	// 依赖对象
	@Autowired
	private BaseUserMapper baseUserMapper;
	@Autowired
	private BaseRoleMapper baseRoleMapper;
	@Autowired
	private BaseUserRoleRelaMapper baseUserRoleRelaMapper;
	@Autowired
	private BaseDeptMapper baseDeptMapper;
	@Autowired
	private BaseOrgMapper baseOrgMapper;


	/**
	 * 授权方法[权限拦截时调用] 每次访问时会由
	 * 1.AuthorizingRealm.getAuthorizationInfo方法触发，先从缓存中取数据，无则会调用该方法
	 * 2.设置属性cachingEnabled=false 不启用缓存，则每次访问都会调用该方法，自行使用缓存来处理
	 * 3.登录成功后会初始化该该方法，则每次权限数据的获取都是从缓存中取
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		Session session = SecurityUtils.getSubject().getSession();
		BaseUser baseUser = (BaseUser) session.getAttribute(ShiroConstant.CURRENT_LOGIN_USER);
		String key = RedisKeyConstant.SIMPLE_AUTHORIZATION_INFO + baseUser.getUserAccount();
		SimpleAuthorizationInfo info = jedisClient.getObject(key, SimpleAuthorizationInfo.class);
		if (info != null && !isInitFlag()) {
			return info;
		}
		info = new SimpleAuthorizationInfo();

		List<BaseRole> roleList = (List<BaseRole>) session.getAttribute(ShiroConstant.USER_ROLE);
		// 登录用户基本权限
		info.addRole("login");
		//TODO
		for (BaseRole baseRole : roleList) {
			// 系统管理员则授予所有权限
			if (Objects.equals(baseRole.getRoleType(), "admin")) {
				// 赋予admin角色
				info.addRole("admin");
				session.setAttribute(ShiroConstant.USER_IS_ADMIN, true);
			}
			info.addRole(baseRole.getRoleId().toString());
		}
		LogTool.info(getClass(),
				">>>>>>成功初始化当前用户userAccount=" + baseUser.getUserAccount() + "对应的角色数据" + info.getRoles());
		jedisClient.set(key, info, expired);
		setInitFlag(false);
		return info;
	}

	/**
	 * 认证方法[登录时调用]
	 * 
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		CustParentToken loginToken = (CustParentToken) token;
		LoginResultBO loginResultBO = null;
		try {
			BaseUser user = loginToken.doLogin();
			loginResultBO = checkUser(user);
			loginToken.setLoginResultBO(loginResultBO);
		} catch (Exception e) {
			LogTool.error(getClass(), e);
			String errorMsg = "服务器繁忙，请稍候重试";
			String errorCode = "9999";
			if (e instanceof SysManageException) {
				SysManageException sysE = (SysManageException) e;
				errorMsg = sysE.getErrorMsg();
				errorCode = sysE.getErrorCode();
			} else {
				Throwable throwable = e.getCause();
				if (throwable != null) {
					errorMsg = throwable.getMessage();
				}
			}
			throw new CustAuthenticationException(errorCode, errorMsg);
		}

		// 当前 Realm 的 name
		String realmName = getName();

		BaseUser user = loginToken.getLoginResultBO().getBaseUser();

		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserAccount(), user.getUserAccount(),
				realmName);
		setInitFlag(true);

		// 获取登陆成功后返回的信息
		setSessionData(loginToken);
		// 登录成功，手动触发获取该用户对应的所有角色
		doGetAuthorizationInfo(info.getPrincipals());
		return info;
	}

	
	/**
	 * @desc: 登录成功后把相应的数据放入session中
	 * @auth:xxx
	 * @date:2016年11月24日 上午11:14:53
	 * @param token
	 *
	 */
	public void setSessionData(CustParentToken token) {
		Session session = SecurityUtils.getSubject().getSession();
		LoginResultBO loginResultBO = token.getLoginResultBO();

		session.setAttribute(ShiroConstant.CURRENT_LOGIN_USER, loginResultBO.getBaseUser());
		session.setAttribute(ShiroConstant.USER_ROLE, loginResultBO.getRoleList());
		session.setAttribute(ShiroConstant.CURRENT_LOGIN_USER_ORG, loginResultBO.getBaseOrg());
		session.setAttribute(ShiroConstant.CURRENT_LOGIN_USER_DEPT, loginResultBO.getBaseDept());

		//是否是机构、部门管理员
		Long userId = loginResultBO.getBaseUser().getUserId();
		String orgManager = loginResultBO.getBaseOrg().getManagerUids();
		session.setAttribute(ShiroConstant.USER_IS_ORG_MANAGER, false);
		if (StringUtils.isNotBlank(orgManager)) {
			orgManager = "," + orgManager + ",";
			if (orgManager.indexOf("," + userId + ",") >= 0) {
				session.setAttribute(ShiroConstant.USER_IS_ORG_MANAGER, true);
			}
		}

		String deptManager = loginResultBO.getBaseDept().getManagerUids();
		session.setAttribute(ShiroConstant.USER_IS_DEPT_MANAGER, false);
		if (StringUtils.isNotBlank(deptManager)) {
			deptManager = "," + deptManager + ",";
			if (deptManager.indexOf("," + userId + ",") >= 0) {
				session.setAttribute(ShiroConstant.USER_IS_DEPT_MANAGER, true);
			}
		}

	}


	/**
	 * @desc: 校验用户合法性,并且返回LoginResultBO
	 * @date:2017年2月7日 上午10:49:21
	 * @param user
	 * @return
	 * @throws SysManageException
	 *
	 */
	private LoginResultBO checkUser(BaseUser user) throws SysManageException {
		if (Objects.equals(user.getStatus(), StatusEnum.STATUS_0.getValue())) {
			throw new SysManageException("该账号已被冻结");
		}
		// 查询当前用户拥有的角色---待优化 TODO
		BaseUserRoleRelaExample baseUserRoleRelaExample = new BaseUserRoleRelaExample();
		txc.xyz.base.model.BaseUserRoleRelaExample.Criteria baseUserRoleRelaCriteria= baseUserRoleRelaExample.createCriteria();
		baseUserRoleRelaCriteria.andUserIdEqualTo(user.getUserId());
		List<BaseUserRoleRela> baseUserRoleRelaList = baseUserRoleRelaMapper.selectByExample(baseUserRoleRelaExample);
		List<BaseRole> roleList = new ArrayList<>();
		if(!baseUserRoleRelaList.isEmpty()){
			for(BaseUserRoleRela record:baseUserRoleRelaList){
				BaseRole role = baseRoleMapper.selectByPrimaryKey(record.getRoleId());
				if(role != null){
					roleList.add(role);
				}
			}
		}
		user.setUserPwd(null);
		LoginResultBO loginResultBO = new LoginResultBO();
		loginResultBO.setBaseUser(user);
		loginResultBO.setRoleList(roleList);
		//机构，部门
		loginResultBO.setBaseDept(baseDeptMapper.selectByPrimaryKey(user.getDeptId()));
		loginResultBO.setBaseOrg(baseOrgMapper.selectByPrimaryKey(user.getOrgId()));
		user.setLastLoginTime(new Timestamp(DateTime.now().getMillis()));
		baseUserMapper.updateByPrimaryKeySelective(user);
		return loginResultBO;
	}

	public boolean isInitFlag() {
		return initFlag;
	}

	public void setInitFlag(boolean initFlag) {
		this.initFlag = initFlag;
	}

}
