/**
 * @Title: CustParentToken.java
 * @Package txc.xxy.ssm.shiro.ext.authc
 * @author Txc
 * @date 2017年5月3日 下午3:54:11
 */

package txc.xxy.ssm.shiro.ext.token;

import org.apache.shiro.authc.UsernamePasswordToken;

import com.n22.cs.comp.shiro.exceprion.SysManageException;

import txc.xxy.ssm.shiro.ext.model.bo.LoginResultBO;

/**
  *
  * @ClassName: CustParentToken
  * @author Txc
  * @date 2017年5月3日 下午3:54:11
  */

public abstract class CustParentToken extends UsernamePasswordToken{
	private static final long serialVersionUID = -7690211443111395382L;
	
	protected LoginResultBO loginResultBO;
	protected String errcode;
	protected String errmsg;
	
	public CustParentToken(){
		super();
	}
	public CustParentToken(String username, String password){
		super(username,password);
	}
	
	//登录方法
	public abstract LoginResultBO doLogin() throws SysManageException;
	
	//登录方式描述
	public abstract String loginTypeDes();
	
	
	public LoginResultBO getLoginResultBO() {
		return loginResultBO;
	}

	public void setLoginResultBO(LoginResultBO loginResultBO) {
		this.loginResultBO = loginResultBO;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
