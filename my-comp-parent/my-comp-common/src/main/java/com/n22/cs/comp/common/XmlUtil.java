package com.n22.cs.comp.common;

import java.beans.PropertyDescriptor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 解析xml数据
 * 
 * @author jackphang
 * @date 2016年6月17日 上午8:40:16
 * @version 1.0
 */
public class XmlUtil {

	private static Logger log = LoggerFactory.getLogger(XmlUtil.class);

	/**
	 * 解析xml,返回第一级元素键值对。如果第一级元素有子节点，则此节点的值是子节点的xml数据。
	 * 
	 * @author : jackphang
	 * @date :2016年6月17日 上午8:40:13
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> doXMLParse(String xmlStr) {
		if (null == xmlStr || "".equals(xmlStr)) {
			return null;
		}

		Map<String, String> m = new HashMap<>();
		InputStream in = String2Inputstream(xmlStr);
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(in);
			Element root = doc.getRootElement();
			List<Element> list = root.getChildren();
			Iterator<Element> it = list.iterator();
			while (it.hasNext()) {
				Element e = (Element) it.next();
				String k = e.getName();
				String v = "";
				List<Element> children = e.getChildren();
				if (children.isEmpty()) {
					v = e.getTextNormalize();
				} else {
					v = getChildrenText(children);
				}

				m.put(k, v);
			}
		} catch (Exception e) {
			log.error("xml解析异常:" + e);
		} finally {
			if (in != null) {
				// 关闭流
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return m;
	}

	/***
	 * @desc: 解析xml->bean
	 * @auth:jackphang
	 * @date:2016年10月10日 上午9:48:40
	 * @param xmlStr
	 * @param type
	 * @return
	 *
	 */
	@SuppressWarnings("unchecked")
	public static <T> T doXMLParse(String xmlStr, Class<?> type) {
		if (null == xmlStr || "".equals(xmlStr)) {
			return null;
		}
		Object obj = null;
		InputStream in = null;
		try {
			obj = type.newInstance(); // 创建 JavaBean 对象
			in = String2Inputstream(xmlStr);
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(in);
			Element root = doc.getRootElement();
			List<Element> list = root.getChildren();
			Iterator<Element> it = list.iterator();
			while (it.hasNext()) {
				Element e = (Element) it.next();
				String k = e.getName();
				String v = "";
				List<Element> children = e.getChildren();
				if (children.isEmpty()) {
					v = e.getTextNormalize();
				} else {
					v = getChildrenText(children);
				}

				try {

					// 属性
					PropertyDescriptor pd = new PropertyDescriptor(k, type);
					// 获得set方法
					Method method = pd.getWriteMethod();
					if (method == null) {
						continue;
					}
					// 为set方法赋值
					method.invoke(obj, new Object[] { v });
				} catch (Exception e1) {
					// 当属性对应的方法不存在时，不影响后续的操作
					log.error("反射异常:" + e1);
				}

			}

		} catch (Exception e) {
			log.error("xml解析异常:" + e);
		} finally {
			if (in != null) {
				// 关闭流
				try {
					in.close();
				} catch (IOException e) {
					log.error("流关闭异常:" + e);
				}
			}
		}
		return (T) obj;
	}

	/**
	 * 获取子结点的xml
	 * 
	 * @author : jackphang
	 * @date :2016年6月17日 上午8:41:47
	 */
	@SuppressWarnings("unchecked")
	public static String getChildrenText(List<Element> children) {
		StringBuffer sb = new StringBuffer();
		if (!children.isEmpty()) {
			Iterator<Element> it = children.iterator();
			while (it.hasNext()) {
				Element e = (Element) it.next();
				String name = e.getName();
				String value = e.getTextNormalize();
				List<Element> list = e.getChildren();
				sb.append("<" + name + ">");
				if (!list.isEmpty()) {
					sb.append(getChildrenText(list));
				}
				sb.append(value);
				sb.append("</" + name + ">");
			}
		}

		return sb.toString();
	}

	public static InputStream String2Inputstream(String str) {
		return new ByteArrayInputStream(str.getBytes());
	}

	/**
	 * @desc: map转化成xml
	 * @auth:jackphang
	 * @date:2016年10月8日 下午7:44:06
	 * @param packageParams
	 * @return
	 *
	 */
	public static String generateXml(Map<String, String> packageParams) {
		StringBuffer xml = new StringBuffer("<xml>");
		Set<Entry<String, String>> es = packageParams.entrySet();
		Iterator<Entry<String, String>> it = es.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			if (null != value && !"".equals(value) && !"null".equals(value)) {
				xml.append("<").append(key).append(">").append("<![CDATA[").append(value).append("]]>").append("</")
						.append(key).append(">");
			}

		}
		return xml.append("</xml>").toString();
	}

	public static void main(String[] args) throws Exception {
		String xml = "<xml><appid><![CDATA[wxa6cab777e1c735f5]]></appid><attach><![CDATA[15]]></attach><bank_type><![CDATA[GDB_CREDIT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1352280301]]></mch_id><nonce_str><![CDATA[2134001892]]></nonce_str><openid><![CDATA[oD9f8s14k4duvXJr665pc_2wQ1gs]]></openid><out_trade_no><![CDATA[160616213387501372]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[D742A2B6F73DC4567BDDE49FE8B6E743]]></sign><time_end><![CDATA[20160616213410]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4010102001201606167378922328]]></transaction_id></xml>";
		Map<String, String> map = doXMLParse(xml);
		System.out.println(map.get(""));
	}

}