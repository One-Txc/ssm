package txc.xxy.ssm.shiro.ext.common.constant;

/**
 * @desc redis key 常量类
 * @author xxx
 * @date 2016年12月12日 下午7:36:58
 */
public interface RedisKeyConstant {

	String PREFIX = "SYS_MANAGE:" + System.getProperty("ext.projectName") + ":";
	/** 所有菜单列表 **/
	String ALL_MENU = PREFIX + "MENU_ALL";

	/** 所有角色列表 **/
	String ALL_ROLE = PREFIX + "ROLE_ALL";

	/** 角色对应菜单列表 **/
	String ROLE_MENU_PREFIX = PREFIX + "ROLE_MENU:";

	/** 角色对应的菜单下指定布局对应的按钮组 **/
	String ROLE_MENU_GROUP_PREFIX = PREFIX + "ROLE_MENU_GROUP:";

	/** 角色对应的权限关系列表 **/
	String ROLE_MENU_RELA_PREFIX = PREFIX + "ROLE_MENU_RELA:";

	/** 角色对应的权限列表 **/
	String ROLE_AUTHC_PREFIX = PREFIX + "ROLE_AUTHC_PREFIX:";

	/** shiro SimpleAuthorizationInfo 权限数据 **/
	String SIMPLE_AUTHORIZATION_INFO = PREFIX + "SIMPLE_AUTHORIZATION_INFO:";

}
