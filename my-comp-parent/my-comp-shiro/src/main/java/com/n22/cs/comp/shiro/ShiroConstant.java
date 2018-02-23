package com.n22.cs.comp.shiro;

public interface ShiroConstant {


	/** ---------------用户session的存储数据----------- **/
	/** 当前登录用户session key **/
	String CURRENT_LOGIN_USER = "CURRENT_LOGIN_USER";
	/** 当前登录用户对应的角色列表 **/
	String USER_ROLE = "USER_ROLE";
	/** 当前登录用户所属机构 **/
	String CURRENT_LOGIN_USER_ORG = "CURRENT_LOGIN_USER_ORG";
	/** 当前登录用户所属部门 **/
	String CURRENT_LOGIN_USER_DEPT = "CURRENT_LOGIN_USER_DEPT";
	/** 当前登录用户是否是系统管理员 **/
	String USER_IS_ADMIN = "USER_IS_ADMIN";
	/** 当前登录用户是否是机构管理员 **/
	String USER_IS_ORG_MANAGER = "USER_IS_ORG_MANAGER";
	/** 当前登录用户是否是部门管理员 **/
	String USER_IS_DEPT_MANAGER = "USER_IS_DEPT_MANAGER";
	/** ---------------用户session的存储数据----------- **/


	/** ---------------redis key前缀----------- **/
	  /*角色对应权限[按钮、操作，不包含菜单]*/
	String role_auth = "role_auth:";
	/*字典配置数据*/
	String config_dict = "config_dict:";
	/** ---------------redis key前缀----------- **/
}
