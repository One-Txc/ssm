package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName base_user_role_rela
  * @Description: 
  * @author Txc
  * @date 2017-04-27
  */
public class BaseUserRoleRela implements Serializable {
	private Long userId;		//用户ID(PK)

	private Long roleId;		//角色ID

	private static final long serialVersionUID = 1L;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("userId=").append(userId);
		sb.append(", roleId=").append(roleId);
		sb.append("]");
		return sb.toString();
	}
}