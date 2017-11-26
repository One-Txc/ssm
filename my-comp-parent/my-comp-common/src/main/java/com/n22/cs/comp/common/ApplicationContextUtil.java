package com.n22.cs.comp.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 该类用于其它非spring容器管理的类时取spring容器中的bean
 * 
 * @author jackphang
 * @date 2016年5月2日 下午1:00:17
 * @version 1.0
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		ApplicationContextUtil.applicationContext = arg0;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static <T> T getBean(String name, Class<T> requiredType) {
		return getApplicationContext().getBean(name, requiredType);
	}

	public static <T> T getBean(Class<T> requiredType) {
		return getApplicationContext().getBean(requiredType);
	}
}