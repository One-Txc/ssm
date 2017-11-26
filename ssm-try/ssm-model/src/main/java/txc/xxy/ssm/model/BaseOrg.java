package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_org
  * @Description: 系统机构表
  * @author Txc
  * @date 2017-04-27
  */
public class BaseOrg implements Serializable {
	private Long orgId;		//系统机构ID(自增)

	private String orgCode;		//机构代码(01-01-01)

	private String innerCode;		//内部编号

	private String shareFlag;		//向上是否开放数据

	private Integer orgLevel;		//机构等级

	private Long parentId;		//父级机构ID

	private String status;		//状态[0-禁用,1-启用]

	private String validFlag;		//有效标识[0-失效,1-有效]

	private String deptCode;		//默认入库部门代码

	private String managerUids;		//管理员id清单(用逗号隔开)

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String issuerFlag;		//是否是卡券发行商[Y-是，N-否]

	private static final long serialVersionUID = 1L;

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	public String getInnerCode() {
		return innerCode;
	}

	public void setInnerCode(String innerCode) {
		this.innerCode = innerCode == null ? null : innerCode.trim();
	}

	public String getShareFlag() {
		return shareFlag;
	}

	public void setShareFlag(String shareFlag) {
		this.shareFlag = shareFlag == null ? null : shareFlag.trim();
	}

	public Integer getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(Integer orgLevel) {
		this.orgLevel = orgLevel;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag == null ? null : validFlag.trim();
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode == null ? null : deptCode.trim();
	}

	public String getManagerUids() {
		return managerUids;
	}

	public void setManagerUids(String managerUids) {
		this.managerUids = managerUids == null ? null : managerUids.trim();
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

	public String getIssuerFlag() {
		return issuerFlag;
	}

	public void setIssuerFlag(String issuerFlag) {
		this.issuerFlag = issuerFlag == null ? null : issuerFlag.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("orgId=").append(orgId);
		sb.append(", orgCode=").append(orgCode);
		sb.append(", innerCode=").append(innerCode);
		sb.append(", shareFlag=").append(shareFlag);
		sb.append(", orgLevel=").append(orgLevel);
		sb.append(", parentId=").append(parentId);
		sb.append(", status=").append(status);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", deptCode=").append(deptCode);
		sb.append(", managerUids=").append(managerUids);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", issuerFlag=").append(issuerFlag);
		sb.append("]");
		return sb.toString();
	}
}