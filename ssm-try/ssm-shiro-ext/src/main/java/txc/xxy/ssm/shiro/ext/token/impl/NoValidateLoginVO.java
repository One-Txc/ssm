/**
 * @Title: NoValidateLoginVo.java
 * @Package com.n22.cs.comp.sysmanage.model.vo
 * @author Txc
 * @date 2017年2月20日 下午4:00:34
 */

package txc.xxy.ssm.shiro.ext.token.impl;

import com.n22.cs.comp.shiro.exceprion.SysManageException;

import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;

/**
  * 无需验证的登录---通过手机号
  * @ClassName: NoValidateLoginVo
  * @author Txc
  * @date 2017年2月20日 下午4:00:34
  */

public class NoValidateLoginVO extends CustParentToken{
	private static final long serialVersionUID = 1548359788855518006L;
	
	private String loginIp;// 登录时的ip
	private String mobile;// 手机号
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public LoginResultBO doLogin() throws SysManageException {
		LoginResultBO loginResultBO  = new LoginResultBO();
		//TODO--具体登录验证处理
		return loginResultBO;
	}

	@Override
	public String loginTypeDes(){
		return "无需验证的登录---通过手机号";
	}
}
