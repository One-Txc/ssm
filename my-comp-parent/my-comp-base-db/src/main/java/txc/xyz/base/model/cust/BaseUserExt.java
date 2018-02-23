package txc.xyz.base.model.cust;


import txc.xyz.base.model.BaseUser;

public class BaseUserExt extends BaseUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7569239966446319218L;

	// 用户列表返回数据
	private String orgName;// 机构名称
	private String deptName;// 部门名称
	private String roleNames;// 角色,格式:角色1,角色2

	// 用户列表返回数据、编辑新增时传递的参数
	private String roleIds;// 角色 格式:1,2
	private Boolean isOrgManager = false;// 是否是机构负责人
	private Boolean isDeptManager = false;// 是否是部门负责人

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}

	public Boolean getIsOrgManager() {
		return isOrgManager;
	}

	public void setIsOrgManager(Boolean isOrgManager) {
		this.isOrgManager = isOrgManager;
	}

	public Boolean getIsDeptManager() {
		return isDeptManager;
	}

	public void setIsDeptManager(Boolean isDeptManager) {
		this.isDeptManager = isDeptManager;
	}

}
