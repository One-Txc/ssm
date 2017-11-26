package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_dept
  * @Description: 系统部门
  * @author Txc
  * @date 2017-04-27
  */
public class BaseDept implements Serializable {
	private Long deptId;		//部门ID

	private String innerCode;		//内部代码

	private String orgCode;		//系统机构代码

	private String deptCode;		//部门代码(01-01-01)

	private String deptName;		//部门名称

	private String deptDesc;		//部门描述

	private String managerUids;		//管理员id清单(用逗号隔开)

	private String status;		//状态[0-禁用,1-启用]

	private String validFlag;		//有效标识[0-失效,1-有效]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getInnerCode() {
		return innerCode;
	}

	public void setInnerCode(String innerCode) {
		this.innerCode = innerCode == null ? null : innerCode.trim();
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode == null ? null : deptCode.trim();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc == null ? null : deptDesc.trim();
	}

	public String getManagerUids() {
		return managerUids;
	}

	public void setManagerUids(String managerUids) {
		this.managerUids = managerUids == null ? null : managerUids.trim();
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
		sb.append("deptId=").append(deptId);
		sb.append(", innerCode=").append(innerCode);
		sb.append(", orgCode=").append(orgCode);
		sb.append(", deptCode=").append(deptCode);
		sb.append(", deptName=").append(deptName);
		sb.append(", deptDesc=").append(deptDesc);
		sb.append(", managerUids=").append(managerUids);
		sb.append(", status=").append(status);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}