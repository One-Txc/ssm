package txc.xyz.base.model.cust;


import txc.xyz.base.model.BaseRole;

public class BaseRoleExt extends BaseRole {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String toRoleNames;

	public String getToRoleNames() {
		return toRoleNames;
	}

	public void setToRoleNames(String toRoleNames) {
		this.toRoleNames = toRoleNames;
	}

	@Override
	public String toString() {
		return "BaseRoleExt [toRoleNames=" + toRoleNames + "]";
	}

}
