package com.n22.cs.comp.redis;

import com.n22.cs.comp.common.ApplicationContextUtil;

/**
 * 用于直接调用redis的方法，无需通过spring注入
 * 
 * @author xxx
 * @date 2016年6月11日 下午3:40:39
 * @version 1.0
 */
public class JedisClientFactory {

	private static JedisClient jedisClient = null;

	private JedisClientFactory() {
		jedisClient = ApplicationContextUtil.getBean("jedisClient",JedisClient.class);
	}

	public static synchronized JedisClient getJedisClient() {
		if (jedisClient == null) {
			new JedisClientFactory();
			return JedisClientFactory.jedisClient;
		}
		return jedisClient;
	}
}
