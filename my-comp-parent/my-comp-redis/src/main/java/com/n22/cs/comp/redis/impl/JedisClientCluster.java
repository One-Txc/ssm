package com.n22.cs.comp.redis.impl;

import javax.annotation.Resource;

import redis.clients.jedis.JedisCluster;

/**
 * 
 * @description Redis 集群版[暂不使用]
 * @author jackphang
 * @date 2016年3月27日 下午6:24:20
 */
public class JedisClientCluster{

	@Resource
	private JedisCluster jedisCluster;

	 

}
