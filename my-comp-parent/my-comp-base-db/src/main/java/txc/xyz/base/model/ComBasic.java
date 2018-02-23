package txc.xyz.base.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName com_basic
  * @Description: 单位基本信息
  * @author Txc
  * @date 2017-04-27
  */
public class ComBasic implements Serializable {
	private String comId;		//单位ID

	private String comName;		//单位名称

	private String abbrName;		//简称

	private String addrCode;		//省市区代码 code1-code2-code3

	private String addrCodeChn;		//省市区中文湖南省-长沙市-雨花区

	private String addrInfo;		//地址详情

	private String contactPerson;		//联系人

	private String tel;		//电话

	private String phoneNo;		//手机

	private String fax;		//传真

	private String bankName;		//开户银行

	private String bankAccount;		//银行账号

	private String taxNumber;		//开票税号

	private String subjectId;		//关联主体ID

	private String subjectType;		//关联主体类型[合作伙伴-partner,机构-org]

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private String gpsX;		//gps经度

	private String gpsY;		//gps维度

	private String gpsAddr;		//Gps位置

	private static final long serialVersionUID = 1L;

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId == null ? null : comId.trim();
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName == null ? null : comName.trim();
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(String abbrName) {
		this.abbrName = abbrName == null ? null : abbrName.trim();
	}

	public String getAddrCode() {
		return addrCode;
	}

	public void setAddrCode(String addrCode) {
		this.addrCode = addrCode == null ? null : addrCode.trim();
	}

	public String getAddrCodeChn() {
		return addrCodeChn;
	}

	public void setAddrCodeChn(String addrCodeChn) {
		this.addrCodeChn = addrCodeChn == null ? null : addrCodeChn.trim();
	}

	public String getAddrInfo() {
		return addrInfo;
	}

	public void setAddrInfo(String addrInfo) {
		this.addrInfo = addrInfo == null ? null : addrInfo.trim();
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson == null ? null : contactPerson.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo == null ? null : phoneNo.trim();
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax == null ? null : fax.trim();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName == null ? null : bankName.trim();
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount == null ? null : bankAccount.trim();
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber == null ? null : taxNumber.trim();
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId == null ? null : subjectId.trim();
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType == null ? null : subjectType.trim();
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

	public String getGpsX() {
		return gpsX;
	}

	public void setGpsX(String gpsX) {
		this.gpsX = gpsX == null ? null : gpsX.trim();
	}

	public String getGpsY() {
		return gpsY;
	}

	public void setGpsY(String gpsY) {
		this.gpsY = gpsY == null ? null : gpsY.trim();
	}

	public String getGpsAddr() {
		return gpsAddr;
	}

	public void setGpsAddr(String gpsAddr) {
		this.gpsAddr = gpsAddr == null ? null : gpsAddr.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("comId=").append(comId);
		sb.append(", comName=").append(comName);
		sb.append(", abbrName=").append(abbrName);
		sb.append(", addrCode=").append(addrCode);
		sb.append(", addrCodeChn=").append(addrCodeChn);
		sb.append(", addrInfo=").append(addrInfo);
		sb.append(", contactPerson=").append(contactPerson);
		sb.append(", tel=").append(tel);
		sb.append(", phoneNo=").append(phoneNo);
		sb.append(", fax=").append(fax);
		sb.append(", bankName=").append(bankName);
		sb.append(", bankAccount=").append(bankAccount);
		sb.append(", taxNumber=").append(taxNumber);
		sb.append(", subjectId=").append(subjectId);
		sb.append(", subjectType=").append(subjectType);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", gpsX=").append(gpsX);
		sb.append(", gpsY=").append(gpsY);
		sb.append(", gpsAddr=").append(gpsAddr);
		sb.append("]");
		return sb.toString();
	}
}