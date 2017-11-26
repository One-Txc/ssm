/**
 * @Title: SysManageException.java
 * @Package com.n22.cs.comp.shiro.exceprion
 * @author Txc
 * @date 2017年5月3日 下午4:09:50
 */

package com.n22.cs.comp.shiro.exceprion;

/**
  *
  * @ClassName: SysManageException
  * @author Txc
  * @date 2017年5月3日 下午4:09:50
  */
@SuppressWarnings("serial")
public class SysManageException extends Exception {
	private String errorCode = "9999";
	private String errorMsg;

	public SysManageException(String message) {
		super(message);
		this.errorMsg = message;
	}

	public SysManageException(String message, Throwable cause) {
		super(message, cause);
		this.errorMsg = message;
	}

	public SysManageException(Throwable cause) {
		super(cause);
	}

	public SysManageException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
}
