package com.n22.cs.comp.shiro;

import org.apache.shiro.authc.AuthenticationException;

public class CustAuthenticationException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1282102673167989717L;

	private String errorCode;

	private String errorMsg;

	public CustAuthenticationException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	public CustAuthenticationException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
