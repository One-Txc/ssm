package com.n22.cs.comp.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.ContextClassLoaderLocal;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description : 是基于org.apache.commons.beanutils的 便于把页面传入的form对象中的值拷到Bo对象中
 *              如Bo中没有的属性在form中存在则不拷贝，
 *              如果目标对象中的属性类型为Long型而拷贝对象为String则把String转为Long 如果 属性值为NULL 则该属性不拷贝
 * @author : pengyanyong
 * @date : 2015年9月27日
 */
public class PropertyUtilsBeanExt extends PropertyUtilsBean {

	Log log = LogFactory.getLog(PropertyUtilsBeanExt.class);

	private static final ContextClassLoaderLocal beansByClassLoader = new ContextClassLoaderLocal() {

		// Creates the default instance used when the context classloader is
		// unavailable
		protected Object initialValue() {
			return new PropertyUtilsBeanExt();
		}
	};

	public static PropertyUtilsBeanExt getInstance() {
		return (PropertyUtilsBeanExt) beansByClassLoader.get();
	}

	@SuppressWarnings("rawtypes")
	public void copyProperties(Object dest, Object orig)
			throws IllegalAccessException,
				InvocationTargetException,
				NoSuchMethodException {

		if (dest == null) {
			throw new IllegalArgumentException("目标对象为空");
		}
		if (orig == null) {
			throw new IllegalArgumentException("没有拷贝对象");
		}

		if (orig instanceof DynaBean) {
			DynaProperty origDescriptors[] = ((DynaBean) orig).getDynaClass().getDynaProperties();
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if (dest instanceof DynaBean) {
					if (isWriteable(dest, name)) {
						Object value = ((DynaBean) orig).get(name);
						((DynaBean) dest).set(name, value);
					}
				} else /* if (dest是一个标准的JavaBean) */ {
					if (isWriteable(dest, name)) {
						Object value = ((DynaBean) orig).get(name);
						setSimpleProperty(dest, name, value);
					}
				}
			}
		} else if (orig instanceof Map) {
			Iterator names = ((Map) orig).keySet().iterator();
			while (names.hasNext()) {
				String name = (String) names.next();
				if (dest instanceof DynaBean) {
					if (isWriteable(dest, name)) {
						Object value = ((Map) orig).get(name);
						((DynaBean) dest).set(name, value);
					}
				} else /* if (dest is a standard JavaBean) */ {
					if (isWriteable(dest, name)) {
						Object value = ((Map) orig).get(name);
						setSimpleProperty(dest, name, value);
					}
				}
			}
		} else /* if (orig is a standard JavaBean) */ {
			PropertyDescriptor origDescriptors[] = getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if (isReadable(orig, name)) {
					if (dest instanceof DynaBean) {
						if (isWriteable(dest, name)) {
							Object value = getSimpleProperty(orig, name);
							((DynaBean) dest).set(name, value);
						}
					} else /* if (dest is a standard JavaBean) */ {
						if (isWriteable(dest, name)) {
							Object value = getSimpleProperty(orig, name);
							if (value == null) {// 值为NULL 不拷贝
								continue;
							}
							setSimpleProperty(dest, name, value);
						}
					}
				}
			}
		}

	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void setSimpleProperty(Object bean, String name, Object value)
			throws IllegalAccessException,
				InvocationTargetException,
				NoSuchMethodException {

		if (bean == null) {
			throw new IllegalArgumentException("对象为空");
		}
		if (name == null) {
			throw new IllegalArgumentException("属性名为空");
		}

		// Validate the syntax of the property name
		if (name.indexOf(PropertyUtils.NESTED_DELIM) >= 0) {
			throw new IllegalArgumentException("属性名不规范");
		} else if (name.indexOf(PropertyUtils.INDEXED_DELIM) >= 0) {
			throw new IllegalArgumentException("属性名不规范");
		} else if (name.indexOf(PropertyUtils.MAPPED_DELIM) >= 0) {
			throw new IllegalArgumentException("属性名不规范");
		}

		// Handle DynaBean instances specially
		if (bean instanceof DynaBean) {
			DynaProperty descriptor = ((DynaBean) bean).getDynaClass().getDynaProperty(name);
			if (descriptor == null) {// 不存在该属性
				return;
			}
			((DynaBean) bean).set(name, value);
			return;
		}

		// Retrieve the property setter method for the specified property
		PropertyDescriptor descriptor = getPropertyDescriptor(bean, name);
		if (descriptor == null) {// 不存在该属性
			return;
		}
		Method writeMethod = getWriteMethod(descriptor);
		if (writeMethod == null) {
			throw new NoSuchMethodException("属性 '" + name + "' 没有Setter方法");
		}
		Class cl = getPropertyType(bean, name);
		if (value != null) /* 在这你可加上把复制对象属性转为目标类属性的代码 */
			if (!cl.getName().equals(value.getClass().getName())) {
				if (cl.getName().equals(Long.class.getName())) {
					if (value.getClass().getName().equals(String.class.getName()))
						value = Long.valueOf((String) value);

				}
			}

		// Call the property setter method
		Object values[] = new Object[1];
		values[0] = value;
		invokeMethod(writeMethod, bean, values);

	}

	private Object invokeMethod(Method method, Object bean, Object[] values)
			throws IllegalAccessException,
				InvocationTargetException {
		try {

			return method.invoke(bean, values);

		} catch (IllegalArgumentException e) {

			log.error("方法反射失败.", e);
			throw new IllegalArgumentException("不能反射: " + method.getDeclaringClass().getName() + "." + method.getName()
					+ " - " + e.getMessage());

		}
	}

}