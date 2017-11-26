package txc.xxy.ssm.shiro.ext.token.impl;

import com.n22.cs.comp.shiro.exceprion.SysManageException;

import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;

/**
 * @desc 微信一键登录需要的业务对象
 * @author jackphang
 * @date 2017年2月7日 上午10:46:34
 */
public class WxLoginVO  extends CustParentToken{
	private static final long serialVersionUID = 470768717687119331L;

	private String loginIp;// 登录时的ip
	private String openid;// 微信openid

	public WxLoginVO() {
	}

	public WxLoginVO(String openid, String loginIp) {
		this.openid = openid;
		this.loginIp = loginIp;
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
	
	public LoginResultBO doLogin() throws SysManageException {
		LoginResultBO loginResultBO  = new LoginResultBO();
		//TODO--具体登录验证处理
		return loginResultBO;
	}

	@Override
	public String loginTypeDes(){
		return "微信一键登录需要的业务对象";
	}

}
