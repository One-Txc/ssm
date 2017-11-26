package com.n22.cs.comp.common.exception;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.n22.cs.comp.common.model.ResultData;
import com.n22.cs.comp.common.model.StatusCode;

/**
 * 自定义异常
 * 
 * @author jackphang
 * @date 2016年4月18日 上午11:02:56
 * @version 1.0
 */
public class N22CoreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3577749339741482905L;

	private String errorCode;

	private String errorMsg;

	public N22CoreException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	public N22CoreException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public N22CoreException(Throwable throwable) {
		super(throwable);
		this.errorCode = StatusCode.ERROR;
		this.errorMsg = throwable.getMessage();
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * 返回错误信息及错误码[JSON]
	 * 
	 * @author : jackphang
	 * @date :2016年4月18日 上午11:08:23
	 */
	public String respMsg() {
		String status = errorCode;
		if (StringUtils.isBlank(status)) {
			status = StatusCode.ERROR;
		}
		ResultData resultData = ResultData.fail(status, errorCode);
		return JSON.toJSONString(resultData);
	}
}
