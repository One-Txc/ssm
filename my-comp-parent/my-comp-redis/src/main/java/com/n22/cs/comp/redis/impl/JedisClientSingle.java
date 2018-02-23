package com.n22.cs.comp.redis.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.n22.cs.comp.redis.JedisClient;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPubSub;

/**
 * 
 * @description Redis 单机版
 * @author xxx
 * @date 2016年3月27日 下午6:24:10
 */
public class JedisClientSingle implements JedisClient {

	@Autowired
	private JedisPool jedisPool;

	@Override
	public String get(String field) {
		return getString(field);
	}

	public String getString(String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get(key);
		jedis.close();
		return string;
	}

	public <T> T getObject(String key, Class<T> type) {
		Jedis jedis = jedisPool.getResource();
		String value = jedis.get(key);
		T obj = JSON.parseObject(value, type);
		jedis.close();
		return obj;
	}

	@Override
	public <T> List<T> getList(String field, Class<T> type) {
		Jedis jedis = jedisPool.getResource();
		String value = jedis.get(field);
		List<T> obj = JSON.parseArray(value, type);
		jedis.close();
		return obj;
	}

	public void set(String field, Object value) {
		set(field, value, null);
	}

	@Override
	public void set(String field, Object value, Integer expired) {
		Jedis jedis = jedisPool.getResource();
		Class<?> clazz = value.getClass();
		// 基本数据类型直接转为String
		if (clazz.equals(String.class) || clazz.equals(Integer.class) || clazz.equals(Byte.class)
				|| clazz.equals(Long.class) || clazz.equals(Double.class) || clazz.equals(Float.class)
				|| clazz.equals(Character.class) || clazz.equals(Short.class) || clazz.equals(BigDecimal.class)
				|| clazz.equals(BigInteger.class) || clazz.equals(Boolean.class)) {
			jedis.set(field, value.toString());
		} else {
			jedis.set(field, JSON.toJSONString(value));
		}

		if (expired != null) {
			jedis.expire(field, expired);
		}
		jedis.close();
	}

	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		return string;
	}

	public long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}

	public long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	public long expire(String key, int second) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, second);
		jedis.close();
		return result;
	}

	public long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}

	public long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.del(key);
		jedis.close();
		return result;
	}

	public long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(hkey, key);
		jedis.close();
		return result;
	}

	public Set<String> keys(String pattern) {
		Jedis jedis = jedisPool.getResource();
		Set<String> result = jedis.keys(pattern);
		jedis.close();
		return result;
	}

	public long hset(byte[] hkey, byte[] key, byte[] value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}

	@Override
	public void psubscribe(JedisPubSub jedisPubSub, String patterns) {
		Jedis jedis = jedisPool.getResource();
		jedis.psubscribe(jedisPubSub, patterns);
		jedis.close();
	}
}
