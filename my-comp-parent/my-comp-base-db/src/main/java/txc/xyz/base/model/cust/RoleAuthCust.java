package txc.xyz.base.model.cust;

/**
 * @author xxx
 * @desc 容器启动初始化角色-权限时使用
 * @date 2016年12月15日 下午2:59:43
 */
public class RoleAuthCust {

    /**
     *
     */
    private static final long serialVersionUID = -6426807151434019439L;

    private Long roleId;
    private Long menuId;// 菜单ID
    private String menuName;// 菜单名称
    private String menuUrl;// 菜单链接
    private String menuCode;//菜单编码

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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Override
    public boolean equals(Object obj) {
        RoleAuthCust roleAuthCust = (RoleAuthCust) obj;
        return roleAuthCust.getRoleId() == this.getRoleId();
    }

    @Override
    public int hashCode() {
        return this.getRoleId().hashCode();
    }
}
