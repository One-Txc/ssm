package txc.xyz.base.model.cust;


import txc.xyz.base.model.BaseDept;
import txc.xyz.base.model.ComBasic;

public class BaseDeptExt extends BaseDept {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1411558566746429736L;

	private String orgName;// 机构名称

	private ComBasic comBasic;

	// 默认入库部门
	private Boolean isDefaultStockIn;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public ComBasic getComBasic() {
		return comBasic;
	}

	public void setComBasic(ComBasic comBasic) {
		this.comBasic = comBasic;
	}

	public Boolean getIsDefaultStockIn() {
		return isDefaultStockIn;
	}

	public void setIsDefaultStockIn(Boolean isDefaultStockIn) {
		this.isDefaultStockIn = isDefaultStockIn;
	}

}
