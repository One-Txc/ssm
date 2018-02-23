package com.n22.cs.comp.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @desc 请求参数工具类
 * @author xxx
 * @date 2016年10月9日 上午8:49:56
 */
public class ReqParamUtil {

	/**
	 * @desc: 获取所有请求参数 ，Map<String,String> value只有一个
	 * @auth:xxx
	 * @date:2016年10月9日 上午8:49:53
	 * @param req
	 * @return
	 *
	 */
	public static Map<String, String> getParamRetMap(HttpServletRequest req) {
		Map<String, String> resultMap = new HashMap<>();
		Map<String, String[]> params = req.getParameterMap();
		for (String key : params.keySet()) {
			String[] values = params.get(key);
			resultMap.put(key, values[0]);
		}
		return resultMap;
	}
	
	

	/**
	 * @desc: 获取所有请求参数 ，返回格式 key=value&key2=value2
	 * @auth:xxx
	 * @date:2016年10月9日 上午8:49:53
	 * @param req
	 * @return
	 *
	 */
	public static String getParamRetStr(HttpServletRequest req) {
		Map<String, String[]> params = req.getParameterMap();
		String queryString = "";
		for (String key : params.keySet()) {
			String[] values = params.get(key);
			for (int i = 0; i < values.length; i++) {
				String value = values[i];
				queryString += key + "=" + value + "&";
			}
		}
		// 去掉最后一个空格
		if (queryString.length() > 1) {
			queryString = queryString.substring(0, queryString.length() - 1);
		}
		return queryString;
	}

	/**
	 * @desc: 获取所有请求参数,返回格式 json {key:value,key:value,key2:value2}
	 * @auth:xxx
	 * @date:2016年10月9日 上午8:54:31
	 * @param req
	 * @return
	 *
	 */
	public static String getParamRetJson(HttpServletRequest req) {
		Map<String, String[]> params = req.getParameterMap();
		String queryString = "{";
		for (String key : params.keySet()) {
			String[] values = params.get(key);
			for (int i = 0; i < values.length; i++) {
				String value = values[i];
				queryString += "\"" + key + "\":" + "\"" + value + "\",";
			}
		}
		// 去掉最后一个空格
		if (queryString.length() > 1) {
			queryString = queryString.substring(0, queryString.length() - 1);
		}
		queryString += "}";
		return queryString;
	}

}
