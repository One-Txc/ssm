package com.n22.cs.comp.redis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.JedisPubSub;

public interface JedisClient {

	public String get(final String field);

	public String getString(final String field);

	public <T> T getObject(final String field, final Class<T> type);

	public <T> List<T> getList(final String field, final Class<T> type);

	public void set(final String field, final Object value);

	public void set(final String field, final Object value, final Integer expired);

	public String hget(final String key, final String field);

	public long hset(final String key, final String field, final String value);

	public long hset(byte[] key, byte[] field, byte[] value);

	public long incr(final String field);

	public long expire(final String field, int second);

	public long ttl(final String field);

	public long del(final String field);

	public long hdel(final String key, final String field);

	public Set<String> keys(final String pattern);

	/**
	 * 订阅消息
	 */
	public void psubscribe(JedisPubSub jedisPubSub, String patterns);

}
