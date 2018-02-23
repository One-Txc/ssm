package com.n22.cs.comp.common.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @desc 自定义返回结果数据结构
 * @author xxx
 * @date 2016年10月27日 下午2:20:34
 */
public class ResultData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String status;// 响应业务状态码
	private String msg;// 响应消息
	private Map<String, Object> data;// 响应数据
	private Map<String, Object> resultMap = new HashMap<>();

	private ResultData() {

	}

	private ResultData(String status, String msg, Map<String, Object> data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 返回结果集
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 上午11:15:31
	 */
	public static ResultData build(String stutus, String msg, Map<String, Object> data) {
		return new ResultData(stutus, msg, data);
	}

	public static ResultData build(String stutus, String msg) {
		return new ResultData(stutus, msg, null);
	}

	/**
	 * 返回失败结果集[带失败信息]
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 上午11:15:31
	 */
	public static ResultData fail(String status, String msg) {
		return new ResultData(status, msg, null);
	}

	/**
	 * 返回失败结果集
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 上午11:15:31
	 */
	public static ResultData fail(String msg) {
		return new ResultData(StatusCode.FAIL, msg, null);
	}

	/**
	 * 返回成功结果集[带返回数据]
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 上午11:15:31
	 */
	public static ResultData success(Map<String, Object> data) {
		return new ResultData(StatusCode.SUCCESS, null, data);
	}

	/**
	 * 成功返回结果集[不返回数据]
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 上午11:15:31
	 */
	public static ResultData success() {
		return new ResultData(StatusCode.SUCCESS, null, null);
	}

	/**
	 * 异常
	 * 
	 * @author : xxx
	 * @date :2016年4月18日 上午11:06:02
	 */
	public static ResultData error(String msg) {
		return new ResultData(StatusCode.ERROR, msg, null);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getData() {
		// data 有可能是传递而来的 map数据、故而多定义了一个resultMap来接收返回数据
		if (data == null) {
			data = resultMap;
		} else {
			data.putAll(resultMap);
		}
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	/**
	 * 往返回结果集中添加数据
	 * 
	 * @author : xxx
	 * @date :2016年4月15日 下午2:20:07
	 */
	public ResultData put(String key, Object value) {
		resultMap.put(key, value);
		return this;
	}

	/**
	 * @desc:往data中添加返回数据,key为小写的类名
	 * @note:只适用于单个对象，不适用于集合
	 * @auth:xxx
	 * @date:2016年12月20日 下午2:18:44
	 * @param value
	 * @return
	 *
	 */
	public ResultData put(Object value) {
		String className = value.getClass().getName();
		String key = className.substring(className.lastIndexOf(".") + 1);
		key = key.substring(0, 1).toLowerCase() + key.substring(1);
		resultMap.put(key, value);
		return this;
	}

	@SuppressWarnings("unchecked")
	public <T> T get(String key) {
		return (T) getData().get(key);
	}

	public void putAll(Map<String, Object> map) {
		resultMap.putAll(map);
	}

	public boolean isSuccess() {
		return status.equals(StatusCode.SUCCESS);
	}

}
