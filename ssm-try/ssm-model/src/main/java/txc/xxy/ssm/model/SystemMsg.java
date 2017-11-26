package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName system_msg
  * @Description: 系统消息
  * @author Txc
  * @date 2017-04-27
  */
public class SystemMsg implements Serializable {
	private String msgId;		//消息ID

	private String sendUid;		//发送方用户ID(即消息创建人)

	private String title;		//消息标题

	private String msgContent;		//消息内容

	private String msgType;		//消息类型[0-系统消息,1--部门消息]

	private String status;		//发送状态[0-发送失败,1-发送成功,2-失效]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String deptId;		//部门id

	private String msgContentTxt;		//'去格式的消息内容'

	private String orgId;		//机构id

	private static final long serialVersionUID = 1L;

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId == null ? null : msgId.trim();
	}

	public String getSendUid() {
		return sendUid;
	}

	public void setSendUid(String sendUid) {
		this.sendUid = sendUid == null ? null : sendUid.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent == null ? null : msgContent.trim();
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType == null ? null : msgType.trim();
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

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId == null ? null : deptId.trim();
	}

	public String getMsgContentTxt() {
		return msgContentTxt;
	}

	public void setMsgContentTxt(String msgContentTxt) {
		this.msgContentTxt = msgContentTxt == null ? null : msgContentTxt.trim();
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId == null ? null : orgId.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("msgId=").append(msgId);
		sb.append(", sendUid=").append(sendUid);
		sb.append(", title=").append(title);
		sb.append(", msgContent=").append(msgContent);
		sb.append(", msgType=").append(msgType);
		sb.append(", status=").append(status);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", deptId=").append(deptId);
		sb.append(", msgContentTxt=").append(msgContentTxt);
		sb.append(", orgId=").append(orgId);
		sb.append("]");
		return sb.toString();
	}
}