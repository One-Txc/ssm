package com.n22.cs.comp.common.model;

import java.io.Serializable;

/**
 * 状态码
 * 
 * @author xxx
 * @date 2016年4月15日 上午11:14:36
 * @version 1.0
 */
public class StatusCode implements Serializable {

	private static final long serialVersionUID = -6723241963404201464L;

	/**
	 * 成功
	 */
	public static final String SUCCESS = "0000";

	/**
	 * 失败
	 */
	public static final String FAIL = "8888";

	/**
	 * 异常
	 */
	public static final String ERROR = "9999";
}
