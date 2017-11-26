package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName wx_base_config
  * @Description: 微信基本配置
  * @author Txc
  * @date 2017-04-27
  */
public class WxBaseConfig implements Serializable {
	private Long sysId;		//系统应用ID

	private String sysName;		//系统名称

	private String appId;		//微信应用ID

	private String appSecret;		//微信应用凭证

	private String originalId;		//微信原始ID

	private String merchantNo;		//微信商户号(用于微信支付)

	private String merchantKey;		//商户key

	private String callbackUrl;		//微信回调URL[]

	private String qrcodeUrl;		//二维码图片url

	private String serviceMobile;		//运营者手机号

	private String wxType;		//公众号类型

	private String validFlag;		//有效性

	private String serviceStatus;		//服务状态

	private String token;		//自动回复消息的token

	private String validatePayMoney;		//校验支付金额N不开启，Y开启 生产环境设置为Y

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private static final long serialVersionUID = 1L;

	public Long getSysId() {
		return sysId;
	}

	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName == null ? null : sysName.trim();
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret == null ? null : appSecret.trim();
	}

	public String getOriginalId() {
		return originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId == null ? null : originalId.trim();
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo == null ? null : merchantNo.trim();
	}

	public String getMerchantKey() {
		return merchantKey;
	}

	public void setMerchantKey(String merchantKey) {
		this.merchantKey = merchantKey == null ? null : merchantKey.trim();
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
	}

	public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl == null ? null : qrcodeUrl.trim();
	}

	public String getServiceMobile() {
		return serviceMobile;
	}

	public void setServiceMobile(String serviceMobile) {
		this.serviceMobile = serviceMobile == null ? null : serviceMobile.trim();
	}

	public String getWxType() {
		return wxType;
	}

	public void setWxType(String wxType) {
		this.wxType = wxType == null ? null : wxType.trim();
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag == null ? null : validFlag.trim();
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus == null ? null : serviceStatus.trim();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token == null ? null : token.trim();
	}

	public String getValidatePayMoney() {
		return validatePayMoney;
	}

	public void setValidatePayMoney(String validatePayMoney) {
		this.validatePayMoney = validatePayMoney == null ? null : validatePayMoney.trim();
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
		sb.append("sysId=").append(sysId);
		sb.append(", sysName=").append(sysName);
		sb.append(", appId=").append(appId);
		sb.append(", appSecret=").append(appSecret);
		sb.append(", originalId=").append(originalId);
		sb.append(", merchantNo=").append(merchantNo);
		sb.append(", merchantKey=").append(merchantKey);
		sb.append(", callbackUrl=").append(callbackUrl);
		sb.append(", qrcodeUrl=").append(qrcodeUrl);
		sb.append(", serviceMobile=").append(serviceMobile);
		sb.append(", wxType=").append(wxType);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", serviceStatus=").append(serviceStatus);
		sb.append(", token=").append(token);
		sb.append(", validatePayMoney=").append(validatePayMoney);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}