package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName demand
  * @Description: 需求表
  * @author Txc
  * @date 2017-04-27
  */
public class Demand implements Serializable {
	private String demandNo;		//需求编号

	private String introducerUid;		//提出人ID

	private String ticketNo;		//ticket号

	private String name;		//需求名称

	private String sourceType;		//需求来源(数据字典)

	private String cateType;		//需求分类

	private String principalUid;		//负责人ID

	private Double expectWorkload;		//期望工作量(工时)

	private Double realWorkload;		//实际工作量(工时)

	private Double customRealWorkload;		//自定义实际工作量

	private Timestamp planStartTime;		//要求响应时间

	private Timestamp planStopTime;		//要求完成时间

	private Timestamp realResponseTime;		//需求受理时间(实际响应)

	private Timestamp realStartTime;		//实际开始时间

	private Timestamp realStopTime;		//实际完成时间

	private Integer olaTotal;		//OLA总计时间(分钟)

	private String description;		//需求描述

	private String remark;		//备注

	private String priorityCode;		//优先级

	private String osName;		//系统名称(中文)

	private String osModuleCode;		//系统模块(中文)

	private String statusCode;		//状态代码

	private String lastBugGroup;		//最近bug提交分组id

	private Timestamp issueTime;		//发布时间

	private String createUid;		//创建人ID

	private String updateUid;		//更新人ID

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private Timestamp lastSubmitTime;

	private static final long serialVersionUID = 1L;

	public String getDemandNo() {
		return demandNo;
	}

	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo == null ? null : demandNo.trim();
	}

	public String getIntroducerUid() {
		return introducerUid;
	}

	public void setIntroducerUid(String introducerUid) {
		this.introducerUid = introducerUid == null ? null : introducerUid.trim();
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo == null ? null : ticketNo.trim();
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

	public Timestamp getRealResponseTime() {
		return realResponseTime;
	}

	public void setRealResponseTime(Timestamp realResponseTime) {
		this.realResponseTime = realResponseTime;
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

	public Integer getOlaTotal() {
		return olaTotal;
	}

	public void setOlaTotal(Integer olaTotal) {
		this.olaTotal = olaTotal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode == null ? null : priorityCode.trim();
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName == null ? null : osName.trim();
	}

	public String getOsModuleCode() {
		return osModuleCode;
	}

	public void setOsModuleCode(String osModuleCode) {
		this.osModuleCode = osModuleCode == null ? null : osModuleCode.trim();
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode == null ? null : statusCode.trim();
	}

	public String getLastBugGroup() {
		return lastBugGroup;
	}

	public void setLastBugGroup(String lastBugGroup) {
		this.lastBugGroup = lastBugGroup == null ? null : lastBugGroup.trim();
	}

	public Timestamp getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(Timestamp issueTime) {
		this.issueTime = issueTime;
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

	public Timestamp getLastSubmitTime() {
		return lastSubmitTime;
	}

	public void setLastSubmitTime(Timestamp lastSubmitTime) {
		this.lastSubmitTime = lastSubmitTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("demandNo=").append(demandNo);
		sb.append(", introducerUid=").append(introducerUid);
		sb.append(", ticketNo=").append(ticketNo);
		sb.append(", name=").append(name);
		sb.append(", sourceType=").append(sourceType);
		sb.append(", cateType=").append(cateType);
		sb.append(", principalUid=").append(principalUid);
		sb.append(", expectWorkload=").append(expectWorkload);
		sb.append(", realWorkload=").append(realWorkload);
		sb.append(", customRealWorkload=").append(customRealWorkload);
		sb.append(", planStartTime=").append(planStartTime);
		sb.append(", planStopTime=").append(planStopTime);
		sb.append(", realResponseTime=").append(realResponseTime);
		sb.append(", realStartTime=").append(realStartTime);
		sb.append(", realStopTime=").append(realStopTime);
		sb.append(", olaTotal=").append(olaTotal);
		sb.append(", description=").append(description);
		sb.append(", remark=").append(remark);
		sb.append(", priorityCode=").append(priorityCode);
		sb.append(", osName=").append(osName);
		sb.append(", osModuleCode=").append(osModuleCode);
		sb.append(", statusCode=").append(statusCode);
		sb.append(", lastBugGroup=").append(lastBugGroup);
		sb.append(", issueTime=").append(issueTime);
		sb.append(", createUid=").append(createUid);
		sb.append(", updateUid=").append(updateUid);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", lastSubmitTime=").append(lastSubmitTime);
		sb.append("]");
		return sb.toString();
	}
}