package com.n22.cs.comp.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * @desc 签名工具类
 * @author jackphang
 * @date 2016年10月13日 下午3:09:02
 */
public class SignUtil {

	private static final String CHARSET = "UTF-8";

	/**
	 * @desc: 创建md5摘要,规则是:按参数名称a-z排序,遇到空值的参数不参加签名。
	 * @auth:jackphang
	 * @date:2016年10月8日 下午6:03:06
	 * @param paramMap
	 * @param signKey
	 *            用于签名的key
	 * @return
	 *
	 */
	public static String createSign(String signKey, Map<String, ?> paramMap) {
		SortedMap<String, Object> packageParams = new TreeMap<>();
		if (paramMap != null && paramMap.size() > 0) {
			packageParams.putAll(paramMap);
		}
		StringBuffer sb = new StringBuffer();
		Set<Entry<String, Object>> es = packageParams.entrySet();
		Iterator<Entry<String, Object>> it = es.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
			String k = (String) entry.getKey();
			Object v = entry.getValue();
			if (null != v && !"".equals(v) && !"null".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}
		sb.append("key=" + signKey);
		String sign = MD5Util.MD5Encode(sb.toString(), CHARSET).toUpperCase();
		return sign;
	}

	/**
	 * 
	 * @desc: 将客户端传递来的参数进行签名,遇到空值的参数不参加签名。
	 * @auth:jackphang
	 * @date:2016年10月14日 上午10:57:53
	 * @param paramJson
	 *            客户端传递的json参数
	 * @param signKey
	 *            签名需要的key
	 * @return
	 *
	 */
	@SuppressWarnings("unchecked")
	public static String createSign(String paramJson, String signKey) {
		SortedMap<String, Object> packageParams = new TreeMap<>();
		if (StringUtils.isNotBlank(paramJson)) {
			Map<String, Object> paramMap = (Map<String, Object>) JSON.parse(paramJson);
			packageParams.putAll(paramMap);
		}
		String soaSign = createSign(signKey, packageParams);
		return soaSign;
	}

	/**
	 * @desc:生成签名
	 * @auth:jackphang
	 * @date:2016年12月9日 下午2:35:07
	 * @param serviceName
	 * @param methodName
	 * @param data
	 * @param token
	 * @return
	 *
	 */
	public static String createSign(String serviceName, String methodName, String data, String token) {
		StringBuffer sb = new StringBuffer();
		sb.append("serviceName=" + serviceName);
		sb.append("&methodName=" + methodName);
		if (StringUtils.isNotBlank(data)) {
			data = data.replaceAll("\r\n", "").replaceAll("\n", "").replaceAll("\r", "").replaceAll(" ", "").replace("\"", "");
			sb.append("&data=" + data);
		}
		sb.append("&key=" + token);
		String sign = MD5Util.MD5Encode(sb.toString(), CHARSET).toUpperCase();
		return sign;
	}

	/**
	 * @desc: 验签
	 * @auth:jackphang
	 * @date:2016年10月9日 下午5:11:27
	 * @param paramMap
	 *            验签的参数
	 * @param respSign
	 *            需要验签的签名
	 * @param signKey
	 *            签名使用的key
	 * @return
	 * @throws Exception
	 *
	 */
	public static boolean validateSign(Map<String, ?> paramMap, String respSign, String signKey) throws Exception {
		SortedMap<String, Object> sortMap = new TreeMap<String, Object>();
		sortMap.putAll(paramMap);
		String sign = createSign(signKey, sortMap);
		return respSign.equals(sign);
	}

	public static void main(String[] args) throws Exception {
		/*String data="{   \"ceshi\" : \"wode\",  \"renshen\" : \"hehe\"}";
		data=data.replaceAll("\r\n", "").replaceAll("\n", "").replaceAll("\r", "").replaceAll(" ", "");
		String sign = MD5Util.MD5Encode(data, CHARSET).toUpperCase();
		 data="serviceName＝user&methodName=loadUserDetailInfoById&data={inviteList:[{mobileNo:13348657717,name:333,inviteId:11111,roleId:3}]}&key=2e0c4dea-6f94-4b2c-a8ad-15974c01f6b3";
		 System.out.println(MD5Util.MD5Encode(data, CHARSET).toUpperCase());*/
//		System.out.println(sign);
		 
		 String xxx = createSign("group","queryList","{\"userId\":\"201612200513192066\",\"showUsers\":\"0\"}","865552db-5fc0-45a7-b6bc-f6b3b7076a88");
		 System.out.println(xxx);
	}

}
