package txc.xyz.base.model.cust;

import txc.xyz.base.model.BaseOrg;
import txc.xyz.base.model.ComBasic;

public class ComBasicExt extends ComBasic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9023816598503012870L;

 
	private BaseOrg baseOrg;

	public BaseOrg getBaseOrg() {
		return baseOrg;
	}

	public void setBaseOrg(BaseOrg baseOrg) {
		this.baseOrg = baseOrg;
	}

}
