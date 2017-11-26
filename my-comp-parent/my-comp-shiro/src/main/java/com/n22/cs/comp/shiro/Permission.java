package com.n22.cs.comp.shiro;

/**
 * 用法: 一、$shiro.isAuthenticated() 功能说明：验证是否为已认证通过的用户，不包含已记住的用户，这是与 isUser
 * 标签方法的区别所在。 参数：无 返回值：Boolean
 * 
 * 二、$shiro.isNotAuthenticated() 功能说明：验证是否为未认证通过用户，与 isAuthenticated 标签相对应，与
 * isGuest 标签的区别是，该标签包含已记住用户。 参数：无 返回值：Boolean
 * 
 * 三、$shiro.isGuest() 功能说明：验证当前用户是否为“访客”，即未认证（包含未记住）的用户。 参数：无 返回值：Boolean
 * 
 * 四、$shiro.isUser() 功能说明：验证当前用户是否认证通过或已记住的用户。 参数：无 返回值：Boolean
 * 
 * 五、$shiro.getPrincipal() 功能说明：获取当前用户 Principal。 参数：无 返回值：Object
 * 
 * 六、$shiro.getPrincipalProperty(String property) 功能说明：获取当前用户 Principal。
 * 参数：String property 用户属性 返回值：Object
 * 
 * 七、$shiro.hasRole(String role) 功能说明：验证当前用户是否属于该角色 。 参数：String role 角色名称
 * 返回值：Boolean
 * 
 * 八、$shiro.lacksRole(String role) 功能说明：验证当前用户是否不属于该角色，与 hasRole 标签逻辑相反。
 * 参数：String role 角色名称 返回值：Boolean
 * 
 * 九、$shiro.hasAnyRoles(String roleNames, String delimeter)
 * 功能说明：验证当前用户是否属于以下任意一个角色。 参数：String roleNames 用户角色列表，以 delimeter 分割 String
 * delimeter 用户角色分隔符 返回值：Boolean
 * 
 * 十、$shiro.hasAnyRoles(String roleNames) 功能说明：验证当前用户是否属于以下任意一个角色。 参数：String
 * roleNames 用户角色列表，以 “," 分割 返回值：Boolean
 * 
 * 十一、$shiro.hasAnyRoles(Collection<String> roleNames) 功能说明：验证当前用户是否属于以下任意一个角色。
 * 参数：Collection<String> roleNames 用户权限角色 返回值：Boolean
 * 
 * 十二、$shiro.hasAnyRoles(String[] roleNames) 功能说明：验证当前用户是否属于以下任意一个角色。
 * 参数：String[] roleNames 用户权限角色 返回值：Boolean
 * 
 * 十三、$shiro.hasPermission(String permission) 功能说明：验证当前用户是否拥有指定权限 参数：String
 * permission 权限名称 返回值：Boolean
 * 
 * 十四、$shiro.lacksPermission(String permission) 功能说明：验证当前用户是否不拥有指定权限，与
 * hasPermission 逻辑相反。 参数：String permission 权限名称 返回值：Boolean
 * 
 * 十五、$shiro.hasAnyPermissions(String permissions, String delimeter)
 * 功能说明：验证当前用户是否拥有以下任意一个权限。 参数：String permissions 权限名称列表，以 delimeter 分割 String
 * delimeter 用户权限分隔符 返回值：Boolean
 * 
 * 十六、$shiro.hasAnyPermissions(String permissions) 功能说明：验证当前用户是否拥有以下任意一个权限。
 * 参数：String permissions 权限名称列表，以 “," 分割 返回值：Boolean
 * 
 * 十七、$shiro.hasAnyPermissions(Collection<String> permissions)
 * 功能说明：验证当前用户是否拥有以下任意一个权限。 参数：Collection<String> 权限名称列表 返回值：Boolean
 * 
 * 十八、$shiro.hasAnyPermissions(String[] permissions) 功能说明：验证当前用户是否拥有以下任意一个权限。
 * 参数：String[] 权限名称列表 返回值：Boolean
 */
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.velocity.tools.Scope;
import org.apache.velocity.tools.config.DefaultKey;
import org.apache.velocity.tools.config.ValidScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Velocity 模板引擎，Shiro 权限标签
 * 
 * 
 */
@DefaultKey("shiro")
@ValidScope(Scope.APPLICATION)
public class Permission {

	private static final String ROLE_NAMES_DELIMETER = ",";
	private static final String PERMISSION_NAMES_DELIMETER = ",";

	private static final Logger logger = LoggerFactory.getLogger(Permission.class);

	/**
	 * 验证是否为已认证通过的用户，不包含已记住的用户，这是与 isUser 标签方法的区别所在。
	 * 
	 * @return 用户是否已通过认证
	 */
	public boolean isAuthenticated() {
		Subject subject = SecurityUtils.getSubject();
		return subject != null && subject.isAuthenticated() == true;
	}

	/**
	 * 验证是否为未认证通过用户，与 isAuthenticated 标签相对应，与 isGuest 标签的区别是，该标签包含已记住用户。
	 * 
	 * @return 用户是否未通过认证
	 */
	public boolean isNotAuthenticated() {
		Subject subject = SecurityUtils.getSubject();
		return subject == null || subject.isAuthenticated() == false;
	}

	/**
	 * 验证用户是否为 <访客>，即未认证（包含未记住）的用户。
	 * 
	 * @return 用户是否为 <访客>
	 */
	public boolean isGuest() {
		Subject subject = SecurityUtils.getSubject();
		return subject == null || subject.getPrincipal() == null;
	}

	/**
	 * 验证用户是否认证通过或已记住的用户。
	 * 
	 * @return 用户是否认证通过或已记住的用户
	 */
	public boolean isUser() {
		Subject subject = SecurityUtils.getSubject();
		return subject != null && subject.getPrincipal() != null;
	}

	/**
	 * 返回用户 Principal。
	 * 
	 * @return 用户 Principal
	 */
	public Object getPrincipal() {
		Subject subject = SecurityUtils.getSubject();
		return subject != null ? subject.getPrincipal() : null;
	}

	/**
	 * 返回用户属性。
	 * 
	 * @param property 属性名称
	 * @return 用户属性
	 */
	public Object getPrincipalProperty(String property) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null) {
			Object principal = subject.getPrincipal();

			try {
				BeanInfo bi = Introspector.getBeanInfo(principal.getClass());

				for (PropertyDescriptor pd : bi.getPropertyDescriptors()) {
					if (pd.getName().equals(property) == true) {
						return pd.getReadMethod().invoke(principal, (Object[]) null);
					}
				}

				logger.trace("Property [{}] not found in principal of type [{}]", property, principal.getClass().getName());
			} catch (Exception e) {
				logger.trace("Error reading property [{}] from principal of type [{}]", property, principal
					.getClass().getName());
			}
		}

		return null;
	}

	/**
	 * 验证用户是否具备某角色。
	 * 
	 * @param role 角色名称
	 * @return 用户是否具备某角色
	 */
	public boolean hasRole(String role) {
		Subject subject = SecurityUtils.getSubject();
		return subject != null && subject.hasRole(role) == true;
	}

	/**
	 * 验证用户是否不具备某角色，与 hasRole 逻辑相反。
	 * 
	 * @param role 角色名称
	 * @return 用户是否不具备某角色
	 */
	public boolean lacksRole(String role) {
		return hasRole(role) != true;
	}

	/**
	 * 验证用户是否具有以下任意一个角色。
	 * 
	 * @param roleNames 以 delimeter 为分隔符的角色列表
	 * @param delimeter 角色列表分隔符
	 * @return 用户是否具有以下任意一个角色
	 */
	public boolean hasAnyRoles(String roleNames, String delimeter) {
		Subject subject = SecurityUtils.getSubject();
		if (subject != null) {
			if (delimeter == null || delimeter.length() == 0) {
				delimeter = ROLE_NAMES_DELIMETER;
			}

			for (String role : roleNames.split(delimeter)) {
				if (subject.hasRole(role.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 验证用户是否具有以下任意一个角色。
	 * 
	 * @param roleNames 以 ROLE_NAMES_DELIMETER 为分隔符的角色列表
	 * @return 用户是否具有以下任意一个角色
	 */
	public boolean hasAnyRoles(String roleNames) {
		return hasAnyRoles(roleNames, ROLE_NAMES_DELIMETER);
	}

	/**
	 * 验证用户是否具有以下任意一个角色。
	 * 
	 * @param roleNames 角色列表
	 * @return 用户是否具有以下任意一个角色
	 */
	public boolean hasAnyRoles(Collection<String> roleNames) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null && roleNames != null) {
			for (String role : roleNames) {
				if (role != null && subject.hasRole(role.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 验证用户是否具有以下任意一个角色。
	 * 
	 * @param roleNames 角色列表
	 * @return 用户是否具有以下任意一个角色
	 */
	public boolean hasAnyRoles(String[] roleNames) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null && roleNames != null) {
			for (int i = 0; i < roleNames.length; i++) {
				String role = roleNames[i];
				if (role != null && subject.hasRole(role.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 验证用户是否具备某权限。
	 * 
	 * @param permission 权限名称
	 * @return 用户是否具备某权限
	 */
	public boolean hasPermission(String permission) {
		Subject subject = SecurityUtils.getSubject();
		return subject != null && subject.isPermitted(permission);
	}

	/**
	 * 验证用户是否不具备某权限，与 hasPermission 逻辑相反。
	 * 
	 * @param permission 权限名称
	 * @return 用户是否不具备某权限
	 */
	public boolean lacksPermission(String permission) {
		return hasPermission(permission) != true;
	}

	/**
	 * 验证用户是否具有以下任意一个权限。
	 * 
	 * @param permissions 以 delimeter 为分隔符的权限列表
	 * @param delimeter 权限列表分隔符
	 * @return 用户是否具有以下任意一个权限
	 */
	public boolean hasAnyPermissions(String permissions, String delimeter) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null) {
			if (delimeter == null || delimeter.length() == 0) {
				delimeter = PERMISSION_NAMES_DELIMETER;
			}

			for (String permission : permissions.split(delimeter)) {
				if (permission != null && subject.isPermitted(permission.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 验证用户是否具有以下任意一个权限。
	 * 
	 * @param permissions 以 PERMISSION_NAMES_DELIMETER 为分隔符的权限列表
	 * @return 用户是否具有以下任意一个权限
	 */
	public boolean hasAnyPermissions(String permissions) {
		return hasAnyPermissions(permissions, PERMISSION_NAMES_DELIMETER);
	}

	/**
	 * 验证用户是否具有以下任意一个权限。
	 * 
	 * @param permissions 权限列表
	 * @return 用户是否具有以下任意一个权限
	 */
	public boolean hasAnyPermissions(Collection<String> permissions) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null && permissions != null) {
			for (String permission : permissions) {
				if (permission != null && subject.isPermitted(permission.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 验证用户是否具有以下任意一个权限。
	 * 
	 * @param permissions 权限列表
	 * @return 用户是否具有以下任意一个权限
	 */
	public boolean hasAnyPermissions(String[] permissions) {
		Subject subject = SecurityUtils.getSubject();

		if (subject != null && permissions != null) {
			for (int i = 0; i < permissions.length; i++) {
				String permission = permissions[i];
				if (permission != null && subject.isPermitted(permission.trim()) == true) {
					return true;
				}
			}
		}

		return false;
	}

}