package txc.xyz.base.model.cust;

import txc.xyz.base.model.BaseMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @desc 容器启动初始化角色-权限时使用
 * @author xxx
 * @date 2016年12月15日 下午2:59:43
 */
public class RoleMenuExt extends BaseMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6426807151434019439L;

	private Long roleId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	// 子节点,构建树形菜单所需
	private List<RoleMenuExt> children = new ArrayList<>();

	public List<RoleMenuExt> getChildren() {
		return children;
	}

	public void setChildren(List<RoleMenuExt> children) {
		this.children = children;
	}

	public void addChild(RoleMenuExt tree) {
		children.add(tree);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RoleMenuExt) {
			RoleMenuExt menu = (RoleMenuExt) obj;
			return Objects.equals(menu.getMenuId(), this.getMenuId());
		}
		return false;
	}
}
