package com.n22.cs.comp.common.web;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.n22.cs.comp.common.log.LogTool;

/**
 * @desc 往System中注入属性
 * @author xxx
 * @date 2016年12月26日 下午2:08:13
 */
public class SystemPropertyListner implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		Enumeration<String> enums = servletContext.getInitParameterNames();
		Map<String, String> map = new LinkedHashMap<>();
		while (enums.hasMoreElements()) {
			String key = enums.nextElement();
			if (!key.startsWith("ext.")) { // 只注入自定义属性
				continue;
			}
			String value = servletContext.getInitParameter(key);
			System.setProperty(key, value);
			map.put(key, value);
		}
		LogTool.debug(getClass(), ">>>>>成功往System.setProperty中注入属性" + map);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}

}
