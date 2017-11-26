package com.n22.cs.comp.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

import com.n22.cs.comp.common.model.ResultData;

/**
 * 自定义token,返回更多的用户信息
 * 
 * @author jackphang
 * @date 2016年4月15日 下午2:51:04
 * @version 1.0
 */
public class CustUsernamePasswordToken extends UsernamePasswordToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = 546660204525711116L;

	private ResultData resultData;
	private String loginType;
	private String clientIP;
	private String flag;

	public CustUsernamePasswordToken(final String username, final String password, String loginType, String clientIP,String flag) {
		super(username, password);
		this.flag = flag;
		this.loginType = loginType;
		this.clientIP = clientIP;
	}
	
	public CustUsernamePasswordToken(final String username, final String password, String clientIP) {
		super(username, password);
		this.clientIP = clientIP;
	}

	public CustUsernamePasswordToken(final String username, final String password, boolean rememberMe) {
		super(username, password, rememberMe);
	}

	public CustUsernamePasswordToken(final String username, final String password, final boolean rememberMe,
			final String host) {
		super(username, password, rememberMe, host);
	}

	public ResultData getResultData() {
		return resultData;
	}

	public void setResultData(ResultData resultData) {
		this.resultData = resultData;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
