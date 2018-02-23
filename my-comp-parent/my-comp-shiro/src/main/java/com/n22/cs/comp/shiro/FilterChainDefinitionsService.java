package com.n22.cs.comp.shiro;

import java.util.Map;

/**
 * 权限配置接口
 * 
 * @author xxx
 * @date 2016年4月14日 下午1:53:54
 * @version 1.0
 */
public interface FilterChainDefinitionsService {

	String PREMISSION_STRING = "perms[{0}]"; // 资源结构格式
	String ROLE_STRING = "role[{0}]"; // 角色结构格式

	/** 初始化框架权限资源配置 */
	void intiPermission();

	/** 重新加载框架权限资源配置 (强制线程同步) */
	//void updatePermission();

	/** 初始化第三方权限资源配置 */
	//Map<String, String> initOtherPermission();
}