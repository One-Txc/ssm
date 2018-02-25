package txc.xxy.ssm.shiro.ext;

import com.n22.cs.comp.shiro.ShiroConstant;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import txc.xyz.base.model.BaseDept;
import txc.xyz.base.model.BaseRole;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.cust.BaseOrgExt;

import java.util.List;
import java.util.Objects;

public class SessionUtil {

	/**
	 * @desc:获取当前登录用户
	 * @auth:jackphang
	 * @date:2016年12月11日 下午2:03:48
	 * @return
	 *
	 */
	public static BaseUser getCurrentUser() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		BaseUser user = (BaseUser) session.getAttribute(ShiroConstant.CURRENT_LOGIN_USER);
		return user;
	}

	/**
	 * @desc: 获取当前登录用户ID
	 * @auth:jackphang
	 * @date:2016年12月11日 下午2:04:10
	 * @return
	 *
	 */
	public static Long getUserId() {
		BaseUser user = getCurrentUser();
		if (user != null) {
			return user.getUserId();
		}
		return null;
	}

	/**
	 * @desc:当前用户所属机构
	 * @auth:jackphang
	 * @date:2016年12月26日 下午5:00:48
	 * @return
	 *
	 */
	public static BaseOrgExt getOrgExt() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		BaseOrgExt org = (BaseOrgExt) session.getAttribute(ShiroConstant.CURRENT_LOGIN_USER_ORG);
		return org;
	}

	public static Long getOrgId() {
		return getOrgExt().getOrgId();
	}

	public static String getOrgCode() {
		return getOrgExt().getOrgCode();
	}

	/**
	 * @desc:当前用户所属部门
	 * @auth:jackphang
	 * @date:2016年12月26日 下午5:03:08
	 * @return
	 *
	 */
	public static BaseDept getDept() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		BaseDept dept = (BaseDept) session.getAttribute(ShiroConstant.CURRENT_LOGIN_USER_DEPT);
		return dept;
	}

	public static Long getDeptId() {
		return getDept().getDeptId();
	}

	/**
	 * 
	 * @desc: 获取当前登录用户对应的角色列表
	 * @auth:jackphang
	 * @date:2016年12月13日 下午4:22:57
	 * @return
	 *
	 */
	@SuppressWarnings("unchecked")
	public static List<BaseRole> getRoleList() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		List<BaseRole> roleList = (List<BaseRole>) session.getAttribute(ShiroConstant.USER_ROLE);
		return roleList;
	}

	/**
	 * @desc:判断当前用户是否具有admin角色
	 * @auth:jackphang
	 * @date:2016年12月24日 下午6:12:49
	 * @return
	 *
	 */
	public static Boolean isAdmin() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		Object isAdmin = session.getAttribute(ShiroConstant.USER_IS_ADMIN);
		if (isAdmin == null) {
			return false;
		}
		return (Boolean) isAdmin;
	}

	/**
	 * @desc:是否是机构负责人
	 * @auth:jackphang
	 * @date:2016年12月26日 下午4:26:35
	 * @return
	 *
	 */
	public static Boolean isOrgManager() {
		return (Boolean) SecurityUtils.getSubject().getSession().getAttribute(ShiroConstant.USER_IS_ORG_MANAGER);
	}

	/**
	 * @desc:是否是部门负责人
	 * @auth:jackphang
	 * @date:2016年12月26日 下午4:26:35
	 * @return
	 *
	 */
	public static Boolean isDeptManager() {
		return (Boolean) SecurityUtils.getSubject().getSession().getAttribute(ShiroConstant.USER_IS_DEPT_MANAGER);
	}

	/**
	 * @desc:是否是卡券发行商
	 * @auth:jackphang
	 * @date:2017年2月16日 上午10:22:08
	 * @return
	 *
	 */
	public static Boolean isIssuer() {
		return Objects.equals(getOrgExt().getIssuerFlag(), "Y") ? true : false;
	}

}
