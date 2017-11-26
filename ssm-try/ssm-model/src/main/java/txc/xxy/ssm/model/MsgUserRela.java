package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName msg_user_rela
  * @Description: 
  * @author Txc
  * @date 2017-04-27
  */
public class MsgUserRela implements Serializable {
	private String userId;		//用户id

	private String msgId;		//消息id

	private String status;		//状态 0-未读,1-已读,2-清除

	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId == null ? null : msgId.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("userId=").append(userId);
		sb.append(", msgId=").append(msgId);
		sb.append(", status=").append(status);
		sb.append("]");
		return sb.toString();
	}
}