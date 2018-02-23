package txc.xyz.base.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_role
  * @Description: 角色
  * @author Txc
  * @date 2017-04-27
  */
public class BaseRole implements Serializable {
	private Long roleId;		//角色ID

	private String roleName;		//角色名称

	private String status;		//角色状态(0-禁用,1-正常)

	private String beRoleIds;		//角色管理范围(针对用户列表中可管理用户),0代表管理可所有角色的用户

	private String roleType;		//角色类型[1-一般角色,2-部门管理员,3-机构管理员]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getBeRoleIds() {
		return beRoleIds;
	}

	public void setBeRoleIds(String beRoleIds) {
		this.beRoleIds = beRoleIds == null ? null : beRoleIds.trim();
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType == null ? null : roleType.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("roleId=").append(roleId);
		sb.append(", roleName=").append(roleName);
		sb.append(", status=").append(status);
		sb.append(", beRoleIds=").append(beRoleIds);
		sb.append(", roleType=").append(roleType);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}