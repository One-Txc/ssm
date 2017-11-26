package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName base_role_menu_rela
  * @Description: 
  * @author Txc
  * @date 2017-04-27
  */
public class BaseRoleMenuRela implements Serializable {
	private Long roleId;		//角色ID

	private Long menuId;		//菜单ID

	private static final long serialVersionUID = 1L;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("roleId=").append(roleId);
		sb.append(", menuId=").append(menuId);
		sb.append("]");
		return sb.toString();
	}
}