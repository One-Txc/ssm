/**
 * @Title: BaseOrgExt.java
 * @Package txc.xxy.ssm.model.ext
 * @author Txc
 * @date 2017年5月3日 下午5:10:20
 */

package txc.xxy.ssm.model.ext;

import txc.xxy.ssm.model.BaseOrg;

/**
  *
  * @ClassName: BaseOrgExt
  * @author Txc
  * @date 2017年5月3日 下午5:10:20
  */
public class BaseOrgExt extends BaseOrg {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1595013250069333765L;

	private String deptId;

	// 查询用户列表，核算单位时返回的数据
	private String orgName;
	private String orgAbbrName;// 机构简称

	// 新增时页面传递的参数
	private String parentOrgId_Code;// 上级机构id和code,以@分隔符

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAbbrName() {
		return orgAbbrName;
	}

	public void setOrgAbbrName(String orgAbbrName) {
		this.orgAbbrName = orgAbbrName;
	}

	public String getParentOrgId_Code() {
		return parentOrgId_Code;
	}

	public void setParentOrgId_Code(String parentOrgId_Code) {
		this.parentOrgId_Code = parentOrgId_Code;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}
