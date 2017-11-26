package com.n22.cs.comp.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.n22.cs.comp.common.ApplicationContextUtil;
import com.n22.cs.comp.redis.impl.JedisClientSingle;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

@Configuration
public class DefaultRedisConfig {

	@Value(value = "${redis.host}")
	private String host;
	@Value(value = "${redis.port}")
	private int port;
	@Value(value = "${redis.password}")
	private String password;
	

	@Value("${redis.maxTotal}")
	public int maxTotal;// 最大连接数
	@Value(value = "${redis.maxIdle}")
	private int maxIdle;// 最大空闲连接数
	@Value(value = "${redis.numTestsPerEvictionRun}")
	private int numTestsPerEvictionRun;// 每次释放连接的最大数目
	@Value(value = "${redis.timeBetweenEvictionRunsMillis}")
	private long timeBetweenEvictionRunsMillis;// 释放连接的扫描间隔（毫秒）
	@Value(value = "${redis.minEvictableIdleTimeMillis}")
	private long minEvictableIdleTimeMillis;// 连接最小空闲时间
	// 连接空闲多久后释放, 当空闲时间>该值 且 空闲连接>最大空闲连接数 时直接释放
	@Value(value = "${redis.softMinEvictableIdleTimeMillis}")
	private int softMinEvictableIdleTimeMillis;
	// 获取连接时的最大等待毫秒数,小于零:阻塞不确定的时间,默认-1
	@Value(value = "${redis.maxWaitMillis}")
	private long maxWaitMillis;
	// 在获取连接的时候检查有效性, 默认false
	@Value(value = "${redis.testOnBorrow}")
	private boolean testOnBorrow;
	// 在空闲时检查有效性, 默认false
	@Value(value = "${redis.testWhileIdle}")
	private boolean testWhileIdle;
	// 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
	@Value(value = "${redis.blockWhenExhausted}")
	private boolean blockWhenExhausted;

	@Bean(name = "jedisPoolConfig")
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(maxTotal);
		jedisPoolConfig.setMaxIdle(maxIdle);
		jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		jedisPoolConfig.setSoftMinEvictableIdleTimeMillis(softMinEvictableIdleTimeMillis);
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
		jedisPoolConfig.setTestOnBorrow(testOnBorrow);
		jedisPoolConfig.setTestWhileIdle(testWhileIdle);
		jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);
		return jedisPoolConfig;
	}

	@Bean(name = "jedisPool")
	public JedisPool jedisPool(JedisPoolConfig jedisPoolConfig) {
		JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port,Protocol.DEFAULT_TIMEOUT,password);
		return jedisPool;
	}

	@Bean(name = "jedisClient")
	public JedisClientSingle jedisClient() {
		return new JedisClientSingle();
	}

	@Bean
	public ApplicationContextUtil applicationContextUtil() {
		return new ApplicationContextUtil();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
