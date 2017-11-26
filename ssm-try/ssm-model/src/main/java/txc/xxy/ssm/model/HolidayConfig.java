package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
  * @tableName holiday_config
  * @Description: 节假日设置
  * @author Txc
  * @date 2017-04-27
  */
public class HolidayConfig implements Serializable {
	private String sid;		//费用公司ID

	private Date startDate;		//开始日期

	private Date endDate;		//结束日期

	private String effectiveCycle;		//生效日期范围,[1,2,3,4,5,6,7]分别代表周一至周日

	private String ownerLevel;		//所属级别[工作日:0,休息日:1,节假日休息:2,节假日补班:3,]  值越大级别越高

	private String validFlag;		//有效标识

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid == null ? null : sid.trim();
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEffectiveCycle() {
		return effectiveCycle;
	}

	public void setEffectiveCycle(String effectiveCycle) {
		this.effectiveCycle = effectiveCycle == null ? null : effectiveCycle.trim();
	}

	public String getOwnerLevel() {
		return ownerLevel;
	}

	public void setOwnerLevel(String ownerLevel) {
		this.ownerLevel = ownerLevel == null ? null : ownerLevel.trim();
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
		sb.append("sid=").append(sid);
		sb.append(", startDate=").append(startDate);
		sb.append(", endDate=").append(endDate);
		sb.append(", effectiveCycle=").append(effectiveCycle);
		sb.append(", ownerLevel=").append(ownerLevel);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}