package com.n22.cs.comp.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public class DispatcherUtils {

	/**
	 * 
	 * @description : 访问路径为 r/home/index.htm 的 则直接跳转至 jsp/home/index.jsp中
	 * @author : xxx
	 * @date :2016年4月6日 下午9:02:10
	 */
	public static String dispatcher(HttpServletRequest request, HttpServletResponse response, Model model) {
		return doDispatcher(request, response, model, false);
	}

	private static String doDispatcher(HttpServletRequest request, HttpServletResponse response, Model model,
			boolean isRestful) {
		String reqUri = request.getRequestURI();

		String contextPath = request.getContextPath();
		if (contextPath != null && contextPath.indexOf("/") == 0) {
			// 截取掉项目名
			reqUri = reqUri.substring(contextPath.length());
		}
		if(reqUri.contains("/r/")){
			reqUri = reqUri.replace("redirect", "").replace("/r/", "/").substring(1);
		}
		String page = "";
		if (isRestful) {
			reqUri = reqUri.replace("rest", "").substring(1);
			page = reqUri.substring(0, reqUri.lastIndexOf("/"));
		} else {
			page = reqUri.substring(0, reqUri.lastIndexOf("."));
		}
		bindParam(request, model);
		return page;
	}
 

	public static String restfulDispatcher(HttpServletRequest request, HttpServletResponse response, Model model) {
		return doDispatcher(request, response, model, true);
	}

	/**
	 * 
	 * @description : 绑定请求参数
	 * @author : xxx
	 * @date :2016年1月14日 下午2:21:26
	 */
 	private static String bindParam(HttpServletRequest request, Model model) {
		String params = "";
		Map<String, String[]> paramMap = request.getParameterMap();
		for (Iterator<Entry<String, String[]>> iter = paramMap.entrySet().iterator(); iter.hasNext();) {
			Entry<String, String[]> entry = iter.next();
			String value[] = entry.getValue();
			if (model != null) {
				model.addAttribute(entry.getKey(), value[0]);
			}
			params += "&" + entry.getKey() + "=" + value[0];
		}
		if (params.indexOf("&") >= 0) {
			params = params.substring(1);
		}
		return params;
	}
}
