package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName task_info
  * @Description: 任务表
  * @author Txc
  * @date 2017-04-27
  */
public class TaskInfo implements Serializable {
	private String taskNo;		//任务编号

	private String subjectId;		//关联主体ID

	private String subjectType;		//关联主体类型[0-需求,1-故障]

	private String name;		//任务名称

	private String sourceType;		//任务来源[需求产生，故障产生]

	private String cateType;		//任务分类（数据字典中的code）

	private String principalUid;		//负责人ID

	private Double expectWorkload;		//期望工作量(工时)

	private Double realWorkload;		//实际工作量(工时)

	private Double customRealWorkload;		//‘自定义实际工作量-完成时自填'

	private Timestamp planStartTime;		//计划开始时间

	private Timestamp planStopTime;		//计划完成时间

	private Timestamp realStartTime;		//实际开始时间

	private Timestamp realStopTime;		//实际完成时间

	private String statusCode;		//状态代码[待接受,未开始,处理中,已结束,已取消]

	private String suspendState;		//挂起状态[0-正常,1-挂起]

	private String createUserId;		//创建人

	private String preTaskId;		//前置任务ID

	private Integer timeTotal;		//计时工作量(分钟)

	private String description;		//背景描述

	private String taskRequire;		//任务要求

	private String slaCode;		//服务等级

	private String priorityCode;		//任务优先级

	private String lastBugGroup;		//最近bug提交分组id

	private String oprUid;		//操作人ID

	private String oprUname;		//操作人姓名(更新人)

	private Timestamp lastSubmitTime;		//最近提交时间

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String finishDescription;

	private static final long serialVersionUID = 1L;

	public String getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo == null ? null : taskNo.trim();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType == null ? null : sourceType.trim();
	}

	public String getCateType() {
		return cateType;
	}

	public void setCateType(String cateType) {
		this.cateType = cateType == null ? null : cateType.trim();
	}

	public String getPrincipalUid() {
		return principalUid;
	}

	public void setPrincipalUid(String principalUid) {
		this.principalUid = principalUid == null ? null : principalUid.trim();
	}

	public Double getExpectWorkload() {
		return expectWorkload;
	}

	public void setExpectWorkload(Double expectWorkload) {
		this.expectWorkload = expectWorkload;
	}

	public Double getRealWorkload() {
		return realWorkload;
	}

	public void setRealWorkload(Double realWorkload) {
		this.realWorkload = realWorkload;
	}

	public Double getCustomRealWorkload() {
		return customRealWorkload;
	}

	public void setCustomRealWorkload(Double customRealWorkload) {
		this.customRealWorkload = customRealWorkload;
	}

	public Timestamp getPlanStartTime() {
		return planStartTime;
	}

	public void setPlanStartTime(Timestamp planStartTime) {
		this.planStartTime = planStartTime;
	}

	public Timestamp getPlanStopTime() {
		return planStopTime;
	}

	public void setPlanStopTime(Timestamp planStopTime) {
		this.planStopTime = planStopTime;
	}

	public Timestamp getRealStartTime() {
		return realStartTime;
	}

	public void setRealStartTime(Timestamp realStartTime) {
		this.realStartTime = realStartTime;
	}

	public Timestamp getRealStopTime() {
		return realStopTime;
	}

	public void setRealStopTime(Timestamp realStopTime) {
		this.realStopTime = realStopTime;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode == null ? null : statusCode.trim();
	}

	public String getSuspendState() {
		return suspendState;
	}

	public void setSuspendState(String suspendState) {
		this.suspendState = suspendState == null ? null : suspendState.trim();
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId == null ? null : createUserId.trim();
	}

	public String getPreTaskId() {
		return preTaskId;
	}

	public void setPreTaskId(String preTaskId) {
		this.preTaskId = preTaskId == null ? null : preTaskId.trim();
	}

	public Integer getTimeTotal() {
		return timeTotal;
	}

	public void setTimeTotal(Integer timeTotal) {
		this.timeTotal = timeTotal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getTaskRequire() {
		return taskRequire;
	}

	public void setTaskRequire(String taskRequire) {
		this.taskRequire = taskRequire == null ? null : taskRequire.trim();
	}

	public String getSlaCode() {
		return slaCode;
	}

	public void setSlaCode(String slaCode) {
		this.slaCode = slaCode == null ? null : slaCode.trim();
	}

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode == null ? null : priorityCode.trim();
	}

	public String getLastBugGroup() {
		return lastBugGroup;
	}

	public void setLastBugGroup(String lastBugGroup) {
		this.lastBugGroup = lastBugGroup == null ? null : lastBugGroup.trim();
	}

	public String getOprUid() {
		return oprUid;
	}

	public void setOprUid(String oprUid) {
		this.oprUid = oprUid == null ? null : oprUid.trim();
	}

	public String getOprUname() {
		return oprUname;
	}

	public void setOprUname(String oprUname) {
		this.oprUname = oprUname == null ? null : oprUname.trim();
	}

	public Timestamp getLastSubmitTime() {
		return lastSubmitTime;
	}

	public void setLastSubmitTime(Timestamp lastSubmitTime) {
		this.lastSubmitTime = lastSubmitTime;
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

	public String getFinishDescription() {
		return finishDescription;
	}

	public void setFinishDescription(String finishDescription) {
		this.finishDescription = finishDescription == null ? null : finishDescription.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("taskNo=").append(taskNo);
		sb.append(", subjectId=").append(subjectId);
		sb.append(", subjectType=").append(subjectType);
		sb.append(", name=").append(name);
		sb.append(", sourceType=").append(sourceType);
		sb.append(", cateType=").append(cateType);
		sb.append(", principalUid=").append(principalUid);
		sb.append(", expectWorkload=").append(expectWorkload);
		sb.append(", realWorkload=").append(realWorkload);
		sb.append(", customRealWorkload=").append(customRealWorkload);
		sb.append(", planStartTime=").append(planStartTime);
		sb.append(", planStopTime=").append(planStopTime);
		sb.append(", realStartTime=").append(realStartTime);
		sb.append(", realStopTime=").append(realStopTime);
		sb.append(", statusCode=").append(statusCode);
		sb.append(", suspendState=").append(suspendState);
		sb.append(", createUserId=").append(createUserId);
		sb.append(", preTaskId=").append(preTaskId);
		sb.append(", timeTotal=").append(timeTotal);
		sb.append(", description=").append(description);
		sb.append(", taskRequire=").append(taskRequire);
		sb.append(", slaCode=").append(slaCode);
		sb.append(", priorityCode=").append(priorityCode);
		sb.append(", lastBugGroup=").append(lastBugGroup);
		sb.append(", oprUid=").append(oprUid);
		sb.append(", oprUname=").append(oprUname);
		sb.append(", lastSubmitTime=").append(lastSubmitTime);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", finishDescription=").append(finishDescription);
		sb.append("]");
		return sb.toString();
	}
}