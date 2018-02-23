package txc.xxy.ssm.shiro.ext.token.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.n22.cs.comp.common.Coder;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.joda.time.DateTime;

import com.n22.cs.comp.common.ApplicationContextUtil;
import com.n22.cs.comp.shiro.exceprion.SysManageException;

import txc.xyz.base.mapper.BaseRoleMapper;
import txc.xyz.base.mapper.BaseUserMapper;
import txc.xyz.base.mapper.BaseUserRoleRelaMapper;
import txc.xyz.base.model.BaseRole;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.BaseUserExample;
import txc.xyz.base.model.BaseUserRoleRela;
import txc.xyz.base.model.BaseUserRoleRelaExample;
import txc.xxy.ssm.shiro.ext.common.enums.StatusEnum;
import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;

/**
 * @desc (用户名-密码)登录
 * @author xxx
 * @date 2016年11月24日 上午11:31:56
 */
public class LoginVO extends CustParentToken{
	private static final long serialVersionUID = 470768717687119331L;

	//  登录属性
	private String userType; // 用户类型
	private String loginIp;// 登录时的ip
	private String openid;
	
	
	// 依赖对象
	private BaseUserMapper baseUserMapper;
//	private BaseRoleMapper baseRoleMapper;
//	private BaseUserRoleRelaMapper baseUserRoleRelaMapper;
	
	
	
	public LoginVO() {
		super();
		//初始化依赖对象
		baseUserMapper = ApplicationContextUtil.getBean(BaseUserMapper.class);
//		baseRoleMapper = ApplicationContextUtil.getBean(BaseRoleMapper.class);
//		baseUserRoleRelaMapper = ApplicationContextUtil.getBean(BaseUserRoleRelaMapper.class);
	}

	public LoginVO(String username, String password, String userType, String loginIp) {
		super(username,password);
		this.userType = userType;
		this.loginIp = loginIp;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	

	public BaseUser doLogin() throws SysManageException {
		if (getPassword() == null || getPassword().length <= 0) {
			throw new AuthenticationException("登录密码为空");
		}
		LoginResultBO loginResultBO  = new LoginResultBO();
		
		//TODO--具体登录验证处理
		if (StringUtils.isBlank(getUsername())) {
			throw new SysManageException("账号为空");
		}
		if (StringUtils.isBlank(getPassword().toString())) {
			throw new SysManageException("密码为空");
		}
		String passwordBase64 = null;
		passwordBase64 = new String(getPassword());
		try {
			// 加密密码
			passwordBase64 = Coder.encryptBASE64(Coder.encryptMD5(passwordBase64.getBytes()));
		} catch (Exception e) {
			throw new SysManageException("加密密码异常", e);
		}
		BaseUserExample baseUserExample = new BaseUserExample();
		txc.xyz.base.model.BaseUserExample.Criteria criteria= baseUserExample.createCriteria();
		criteria.andUserAccountEqualTo(getUsername());
		List<BaseUser> userList = baseUserMapper.selectByExampleWithBLOBs(baseUserExample);
		if(userList.isEmpty()){
			throw new SysManageException("用户名不存在");
		}
		if(userList.size() > 1){
			throw new SysManageException("存在重复的用户名");
		}
		BaseUser user = userList.get(0);
		if (!user.getUserPwd().equals(passwordBase64)) {
			throw new SysManageException("密码不正确");
		}
		if(StringUtils.isNotBlank(getOpenid())){
			user.setOpenId(getOpenid());
		}

		//loginResultBO.setBaseUser(user);
		//loginResultBO = checkUser(user);
		
		return user;
	}
	
	@Override
	public String loginTypeDes(){
		return "(用户名-密码)登录";
	}

}
