package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName work
  * @Description: 工作
  * @author Txc
  * @date 2017-04-27
  */
public class Work implements Serializable {
	private String workId;		//工作ID

	private String typeCode;		//工作类型code对应数据字典

	private String title;		//工作标题标题

	private String workPercent;		//工作量百分比

	private Double realWorkload;		//实际工作量

	private String require;		//要求

	private String content;		//内容

	private String remark;		//备注

	private String createUid;		//创建人

	private String createUname;

	private String principalUid;		//接收人

	private String status;		//状态代码[0-未提交,1-已提交,2-已删除]

	private Timestamp startTime;

	private Timestamp finishTime;

	private Timestamp submitTime;		//提交时间

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId == null ? null : workId.trim();
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode == null ? null : typeCode.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getWorkPercent() {
		return workPercent;
	}

	public void setWorkPercent(String workPercent) {
		this.workPercent = workPercent == null ? null : workPercent.trim();
	}

	public Double getRealWorkload() {
		return realWorkload;
	}

	public void setRealWorkload(Double realWorkload) {
		this.realWorkload = realWorkload;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require == null ? null : require.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getCreateUid() {
		return createUid;
	}

	public void setCreateUid(String createUid) {
		this.createUid = createUid == null ? null : createUid.trim();
	}

	public String getCreateUname() {
		return createUname;
	}

	public void setCreateUname(String createUname) {
		this.createUname = createUname == null ? null : createUname.trim();
	}

	public String getPrincipalUid() {
		return principalUid;
	}

	public void setPrincipalUid(String principalUid) {
		this.principalUid = principalUid == null ? null : principalUid.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Timestamp finishTime) {
		this.finishTime = finishTime;
	}

	public Timestamp getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
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
		sb.append("workId=").append(workId);
		sb.append(", typeCode=").append(typeCode);
		sb.append(", title=").append(title);
		sb.append(", workPercent=").append(workPercent);
		sb.append(", realWorkload=").append(realWorkload);
		sb.append(", require=").append(require);
		sb.append(", content=").append(content);
		sb.append(", remark=").append(remark);
		sb.append(", createUid=").append(createUid);
		sb.append(", createUname=").append(createUname);
		sb.append(", principalUid=").append(principalUid);
		sb.append(", status=").append(status);
		sb.append(", startTime=").append(startTime);
		sb.append(", finishTime=").append(finishTime);
		sb.append(", submitTime=").append(submitTime);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}