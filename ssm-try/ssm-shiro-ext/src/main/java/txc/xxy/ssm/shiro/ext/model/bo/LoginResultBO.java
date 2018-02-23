package txc.xxy.ssm.shiro.ext.model.bo;

import java.io.Serializable;
import java.util.List;

import txc.xyz.base.model.BaseDept;
import txc.xyz.base.model.BaseOrg;
import txc.xyz.base.model.BaseRole;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.cust.BaseOrgExt;


/**
 * @desc 登录结果返回数据
 * @date 2016年12月13日 下午4:12:10
 */
public class LoginResultBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2123885000741848777L;

	private BaseUser baseUser;

	private List<BaseRole> roleList;

	private BaseDept baseDept;// 部门

	private BaseOrg baseOrg;// 机构


	public BaseUser getBaseUser() {
		return baseUser;
	}

	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}

	public List<BaseRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<BaseRole> roleList) {
		this.roleList = roleList;
	}

	public BaseDept getBaseDept() {
		return baseDept;
	}

	public void setBaseDept(BaseDept baseDept) {
		this.baseDept = baseDept;
	}

	public BaseOrg getBaseOrg() {
		return baseOrg;
	}

	public void setBaseOrg(BaseOrg baseOrg) {
		this.baseOrg = baseOrg;
	}
}
