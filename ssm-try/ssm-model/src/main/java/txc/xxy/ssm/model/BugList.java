package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName bug_list
  * @Description: 测试bug清单
  * @author Txc
  * @date 2017-04-27
  */
public class BugList implements Serializable {
	private String bugId;		//bug_id

	private String bugTitle;		//bug标题

	private String typeCode;		//bug类型code

	private String priorityCode;		//优先级

	private String errorLevel;		//严重程度

	private String bugDesc;		//bug_desc

	private String accessoryUrl;		//附件下载地址

	private String accessoryTitle;		//附件标题

	private String feedback;		//反馈描述

	private String subjectId;		//主体ID

	private String subjectType;		//主体类型[0-需求,1-故障任务]

	private String groupId;		//单次提交分组ID

	private String status;		//状态[0-待提交,1-未解决,2-已解决题,3-bug不存在]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String createUid;		//创建者ID

	private String updateUid;		//更新者ID

	private static final long serialVersionUID = 1L;

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId == null ? null : bugId.trim();
	}

	public String getBugTitle() {
		return bugTitle;
	}

	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle == null ? null : bugTitle.trim();
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode == null ? null : typeCode.trim();
	}

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode == null ? null : priorityCode.trim();
	}

	public String getErrorLevel() {
		return errorLevel;
	}

	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel == null ? null : errorLevel.trim();
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc == null ? null : bugDesc.trim();
	}

	public String getAccessoryUrl() {
		return accessoryUrl;
	}

	public void setAccessoryUrl(String accessoryUrl) {
		this.accessoryUrl = accessoryUrl == null ? null : accessoryUrl.trim();
	}

	public String getAccessoryTitle() {
		return accessoryTitle;
	}

	public void setAccessoryTitle(String accessoryTitle) {
		this.accessoryTitle = accessoryTitle == null ? null : accessoryTitle.trim();
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback == null ? null : feedback.trim();
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

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId == null ? null : groupId.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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

	public String getCreateUid() {
		return createUid;
	}

	public void setCreateUid(String createUid) {
		this.createUid = createUid == null ? null : createUid.trim();
	}

	public String getUpdateUid() {
		return updateUid;
	}

	public void setUpdateUid(String updateUid) {
		this.updateUid = updateUid == null ? null : updateUid.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("bugId=").append(bugId);
		sb.append(", bugTitle=").append(bugTitle);
		sb.append(", typeCode=").append(typeCode);
		sb.append(", priorityCode=").append(priorityCode);
		sb.append(", errorLevel=").append(errorLevel);
		sb.append(", bugDesc=").append(bugDesc);
		sb.append(", accessoryUrl=").append(accessoryUrl);
		sb.append(", accessoryTitle=").append(accessoryTitle);
		sb.append(", feedback=").append(feedback);
		sb.append(", subjectId=").append(subjectId);
		sb.append(", subjectType=").append(subjectType);
		sb.append(", groupId=").append(groupId);
		sb.append(", status=").append(status);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", createUid=").append(createUid);
		sb.append(", updateUid=").append(updateUid);
		sb.append("]");
		return sb.toString();
	}
}