package com.n22.cs.comp.shiro;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.util.WebUtils;

import com.alibaba.fastjson.JSON;
import com.n22.cs.comp.common.WebUtil;
import com.n22.cs.comp.common.model.ResultData;

/**
 * 自定义角色鉴权过滤器,扩展异步请求认证提示功能;
 * 
 * @author jackphang
 * @date 2016年4月15日 下午4:41:52
 * @version 1.0
 */
public class CustRolesAuthorizationFilter extends RolesAuthorizationFilter {

	/**
	 * 访问被允许时判断角色
	 */
	@Override
	public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws IOException {
		// 默认使用的是 hasAllRoles
		final Subject subject = getSubject(request, response);
		final String[] rolesArray = (String[]) mappedValue;

		if (rolesArray == null || rolesArray.length == 0) {
			// no roles specified, so nothing to check - allow access.
			return true;
		}

		for (String roleName : rolesArray) {
			if (subject.hasRole(roleName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 访问被禁止时,扩展异步请求认证提示功能
	 * 
	 * @author : jackphang
	 * @date :2016年4月15日 下午4:42:43
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		Subject subject = getSubject(request, response);
		// 登录成功后跳转的url
		String returnUrl = req.getParameter("returnUrl");
		if (subject.getPrincipal() == null) {
			HttpSession session = req.getSession();
			if (session.getAttribute(ShiroConstant.CURRENT_LOGIN_USER) != null) {
				return true;
			}
			if (WebUtil.isAjax(req)) {// ajax请求
				// 登录状态
				ResultData resultData = ResultData.fail("LOGIN_TIME_OUT", "您尚未登录或登录时间过长,请重新登录");
				resultData.put("returnUrl", returnUrl);
				String respData = JSON.toJSONString(resultData);
				out.println(respData);
				out.flush();
				out.close();
			} else {
				saveRequestAndRedirectToLogin(request, response);
			}
		} else {
			String url = req.getRequestURI().replaceAll(req.getContextPath(), "");
			String msg = "您没有足够的权限执行此操作,请联系管理员[url=" + url + "]";
			if (WebUtil.isAjax(req)) {// ajax请求
				// 权限状态
				ResultData resultData = ResultData.fail("UN_AUTHC", msg);
				String respData = JSON.toJSONString(resultData);
				out.println(respData);
				out.flush();
				out.close();
			} else {
				msg = URLEncoder.encode(msg, "UTF-8");
				String unauthorizedUrl = getUnauthorizedUrl();
				if (StringUtils.hasText(unauthorizedUrl)) {
					WebUtils.issueRedirect(request, response, unauthorizedUrl + "?msg=" + msg);
				} else {
					WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
				}
			}

		}
		return false;
	}

	public void clearAppliedPaths() {
		super.appliedPaths = new LinkedHashMap<String, Object>();
	}
	
	public Map<String, Object> getAppliedPaths(){
		return super.appliedPaths;
	}
}
