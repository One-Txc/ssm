package txc.xyz.base.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_dict
  * @Description: 数据字典表
  * @author Txc
  * @date 2017-04-27
  */
public class BaseDict implements Serializable {
	private Long id;		//PK

	private String sysName;		//系统名称

	private String code;		//代码(全局唯一)

	private String name;		//内容

	private String remark;		//备注

	private Integer orderNo;		//排序号

	private String validFlag;		//0-失效,1-有效
            

	private Long parentId;		//上级字典ID

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private Long createUid;		//创建者

	private Long updateUid;		//更新者

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName == null ? null : sysName.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag == null ? null : validFlag.trim();
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
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

	public Long getCreateUid() {
		return createUid;
	}

	public void setCreateUid(Long createUid) {
		this.createUid = createUid;
	}

	public Long getUpdateUid() {
		return updateUid;
	}

	public void setUpdateUid(Long updateUid) {
		this.updateUid = updateUid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("id=").append(id);
		sb.append(", sysName=").append(sysName);
		sb.append(", code=").append(code);
		sb.append(", name=").append(name);
		sb.append(", remark=").append(remark);
		sb.append(", orderNo=").append(orderNo);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", parentId=").append(parentId);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", createUid=").append(createUid);
		sb.append(", updateUid=").append(updateUid);
		sb.append("]");
		return sb.toString();
	}
}