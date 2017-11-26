package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName wx_template_rela
  * @Description: 微信模板消息关系
  * @author Txc
  * @date 2017-04-27
  */
public class WxTemplateRela implements Serializable {
	private Long relaId;		//关系ID

	private String templateCode;		//模板编号

	private String templateId;		//模板ID

	private String appId;		//微信应用ID

	private String validFlag;		//有效性[0-无效，1-有效]

	private String status;		//启用状态[0-禁用，1-启用]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public Long getRelaId() {
		return relaId;
	}

	public void setRelaId(Long relaId) {
		this.relaId = relaId;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode == null ? null : templateCode.trim();
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId == null ? null : templateId.trim();
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag == null ? null : validFlag.trim();
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("relaId=").append(relaId);
		sb.append(", templateCode=").append(templateCode);
		sb.append(", templateId=").append(templateId);
		sb.append(", appId=").append(appId);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", status=").append(status);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}