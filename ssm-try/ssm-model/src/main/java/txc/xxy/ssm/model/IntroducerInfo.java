package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName introducer_info
  * @Description: 提出人信息表
  * @author Txc
  * @date 2017-04-27
  */
public class IntroducerInfo implements Serializable {
	private String introducerUid;		//提出人ID

	private String introducerName;		//姓名

	private String tel;		//电话

	private String mobileNo;		//手机

	private String wxNo;		//微信

	private String email;		//邮箱

	private String businessArea;		//业务大区[数据字典中的业务大区]

	private String orgCode;		//机构[数据字典中的机构]

	private String deptCode;		//部门[数据字典中的部门]

	private String addrCode;		//省市区代码

	private String addrChn;		//省市区中文 省-市-区

	private static final long serialVersionUID = 1L;

	public String getIntroducerUid() {
		return introducerUid;
	}

	public void setIntroducerUid(String introducerUid) {
		this.introducerUid = introducerUid == null ? null : introducerUid.trim();
	}

	public String getIntroducerName() {
		return introducerName;
	}

	public void setIntroducerName(String introducerName) {
		this.introducerName = introducerName == null ? null : introducerName.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo == null ? null : mobileNo.trim();
	}

	public String getWxNo() {
		return wxNo;
	}

	public void setWxNo(String wxNo) {
		this.wxNo = wxNo == null ? null : wxNo.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea == null ? null : businessArea.trim();
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

	public String getAddrCode() {
		return addrCode;
	}

	public void setAddrCode(String addrCode) {
		this.addrCode = addrCode == null ? null : addrCode.trim();
	}

	public String getAddrChn() {
		return addrChn;
	}

	public void setAddrChn(String addrChn) {
		this.addrChn = addrChn == null ? null : addrChn.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("introducerUid=").append(introducerUid);
		sb.append(", introducerName=").append(introducerName);
		sb.append(", tel=").append(tel);
		sb.append(", mobileNo=").append(mobileNo);
		sb.append(", wxNo=").append(wxNo);
		sb.append(", email=").append(email);
		sb.append(", businessArea=").append(businessArea);
		sb.append(", orgCode=").append(orgCode);
		sb.append(", deptCode=").append(deptCode);
		sb.append(", addrCode=").append(addrCode);
		sb.append(", addrChn=").append(addrChn);
		sb.append("]");
		return sb.toString();
	}
}