package com.n22.cs.comp.common;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @description Json格式化工具
 * @author jackphang
 * @date 2016年3月27日 下午4:26:18
 */
public class JsonUtil {

	/**
	 * 将对象转换成json字符串。
	 * 
	 * @param data
	 * @return
	 */
	public static String objectToJson(Object data) {
		return JSON.toJSONString(data);
	}

	/**
	 * 将json结果集转化为对象 不支持beanType是Map的情况，请使用jsonToMap方法
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            对象中的object类型(List,Object等)
	 * @return
	 */
	public static <T> T jsonToObject(String jsonData, Class<T> beanType) {
		if (StringUtils.isBlank(jsonData) || jsonData.trim().equals("[]")) {
			return null;
		}
		return JSON.parseObject(jsonData, beanType);
	}

	/**
	 * 将json数据转换成pojo对象list
	 * 
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
		if (StringUtils.isBlank(jsonData) || jsonData.trim().equals("[]")) {
			return null;
		}
		return JSON.parseArray(jsonData, beanType);
	}

}
