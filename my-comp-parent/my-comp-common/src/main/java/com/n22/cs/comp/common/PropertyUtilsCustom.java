package com.n22.cs.comp.common;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * @Description : 是基于org.apache.commons.beanutils的 便于把页面传入的form对象中的值拷到Bo对象中
 *              如Bo中没有的属性在form中存在则不拷贝，
 *              如果目标对象中的属性类型为Long型而拷贝对象为String则把String转为Long 如果 属性值为NULL则该属性不拷贝
 * @author : pengyanyong
 * @date : 2015年9月27日
 */
public class PropertyUtilsCustom extends PropertyUtils {
	public static void copyProperties(Object dest, Object orig)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		PropertyUtilsBeanExt.getInstance().copyProperties(dest, orig);
	}
}