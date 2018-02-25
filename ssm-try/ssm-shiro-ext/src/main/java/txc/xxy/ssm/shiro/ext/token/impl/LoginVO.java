package txc.xxy.ssm.shiro.ext.token.impl;

import com.n22.cs.comp.common.ApplicationContextUtil;
import com.n22.cs.comp.common.Coder;
import com.n22.cs.comp.shiro.exceprion.SysManageException;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;
import txc.xyz.base.mapper.BaseUserMapper;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.BaseUserExample;

import java.util.List;

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
	private WxMpService wxMpService;
	
	public LoginVO() {
		super();
		//初始化依赖对象
		baseUserMapper = ApplicationContextUtil.getBean(BaseUserMapper.class);
		wxMpService = ApplicationContextUtil.getBean(WxMpService.class);
	}

	public LoginVO(String username, String password, String userType, String loginIp) {
		super(username,password);
		//初始化依赖对象
		baseUserMapper = ApplicationContextUtil.getBean(BaseUserMapper.class);
		wxMpService = ApplicationContextUtil.getBean(WxMpService.class);
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
			//关联微信头像
			if(StringUtils.isBlank(user.getIconImgUrl())){
				try {
					WxMpUser wxMpUser = wxMpService.getUserService().userInfo(getOpenid());
					user.setIconImgUrl(wxMpUser.getHeadImgUrl());
				} catch (WxErrorException e) {
					//处理异常，即使报错以不影响正常流程
					e.printStackTrace();
				}
			}
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
