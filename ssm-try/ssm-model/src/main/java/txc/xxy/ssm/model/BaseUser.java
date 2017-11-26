package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_user
  * @Description: 用户表
  * @author Txc
  * @date 2017-04-27
  */
public class BaseUser implements Serializable {
	private Long userId;		//用户ID(PK)

	private String realName;		//姓名

	private String iconImgUrl;		//头像url地址

	private String userAccount;		//用户名(默认注册手机号码)

	private String userPwd;		//用户密码

	private String nationCode;		//用户绑定手机所属国际区号

	private String userMobile;		//用户绑定手机号码

	private String openId;		//微信(服务号)唯一标识

	private Timestamp lastLoginTime;		//最后登录时间

	private Long deptId;		//部门ID

	private Long orgId;		//系统机构ID

	private String status;		//状态[0-禁用,1-启用]

	private String validFlag;		//有效标识[0-失效,1-有效]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String userExt;		//用户拓展信息data(json)

	private static final long serialVersionUID = 1L;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getIconImgUrl() {
		return iconImgUrl;
	}

	public void setIconImgUrl(String iconImgUrl) {
		this.iconImgUrl = iconImgUrl == null ? null : iconImgUrl.trim();
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount == null ? null : userAccount.trim();
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd == null ? null : userPwd.trim();
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode == null ? null : nationCode.trim();
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile == null ? null : userMobile.trim();
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
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

	public String getUserExt() {
		return userExt;
	}

	public void setUserExt(String userExt) {
		this.userExt = userExt == null ? null : userExt.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("userId=").append(userId);
		sb.append(", realName=").append(realName);
		sb.append(", iconImgUrl=").append(iconImgUrl);
		sb.append(", userAccount=").append(userAccount);
		sb.append(", userPwd=").append(userPwd);
		sb.append(", nationCode=").append(nationCode);
		sb.append(", userMobile=").append(userMobile);
		sb.append(", openId=").append(openId);
		sb.append(", lastLoginTime=").append(lastLoginTime);
		sb.append(", deptId=").append(deptId);
		sb.append(", orgId=").append(orgId);
		sb.append(", status=").append(status);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", userExt=").append(userExt);
		sb.append("]");
		return sb.toString();
	}
}