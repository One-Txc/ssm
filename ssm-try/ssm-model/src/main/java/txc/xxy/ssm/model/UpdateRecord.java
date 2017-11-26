package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName update_record
  * @Description: 更新记录
  * @author Txc
  * @date 2017-04-27
  */
public class UpdateRecord implements Serializable {
	private String sid;		//流水ID

	private String subjectId;		//主体ID

	private String subjectType;		//主体类型[0-需求,1-故障,2-需求任务,3-bug]

	private String nodeStatusCode;		//节点状态代码

	private String nodeSuspendState;		//节点挂起状态代码【0-正常，1-挂起】

	private String remark;		//备注

	private Timestamp createTime;		//操作时间

	private String userId;		//操作人Id

	private String userName;		//操作人姓名

	private static final long serialVersionUID = 1L;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid == null ? null : sid.trim();
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId == null ? null : subjectId.trim();
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType == null ? null : subjectType.trim();
	}

	public String getNodeStatusCode() {
		return nodeStatusCode;
	}

	public void setNodeStatusCode(String nodeStatusCode) {
		this.nodeStatusCode = nodeStatusCode == null ? null : nodeStatusCode.trim();
	}

	public String getNodeSuspendState() {
		return nodeSuspendState;
	}

	public void setNodeSuspendState(String nodeSuspendState) {
		this.nodeSuspendState = nodeSuspendState == null ? null : nodeSuspendState.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("sid=").append(sid);
		sb.append(", subjectId=").append(subjectId);
		sb.append(", subjectType=").append(subjectType);
		sb.append(", nodeStatusCode=").append(nodeStatusCode);
		sb.append(", nodeSuspendState=").append(nodeSuspendState);
		sb.append(", remark=").append(remark);
		sb.append(", createTime=").append(createTime);
		sb.append(", userId=").append(userId);
		sb.append(", userName=").append(userName);
		sb.append("]");
		return sb.toString();
	}
}