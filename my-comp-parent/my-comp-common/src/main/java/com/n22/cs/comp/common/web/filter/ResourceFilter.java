package com.n22.cs.comp.common.web.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.n22.cs.comp.common.OutUtil;
import com.n22.cs.comp.common.ServletPathMatcher;

/**
 * @desc 配置 resource filter
 * @remark 用于访问 class 下的资源文件
 * @author jackphang
 * @date 2016年10月29日 上午11:11:25
 */
public abstract class ResourceFilter implements Filter {

	private String loginPath = "/login.srv";
	private String loginPage = "/login.html";
	private String indexPage = "/index.html";
	protected String resourcePath = "/resources";

	private final String SESSION_USER_KEY = "resource-user";

	// 登录请求
	private final String PARAM_NAME_LOGINPATH = "loginPath";
	// 登录资源文件名
	private final String PARAM_NAME_LOGINPAGE = "loginPage";
	// 首页资源文件名
	private final String PARAM_NAME_INDEXPAGE = "indexPage";
	// 在class下资源文件所在路径,各模块请保持路径不一致，否则无法正确读取
	private final String PARAM_NAME_RESOURCEPATH = "resourcePath";
	// 登录用户名
	private final String PARAM_NAME_USERNAME = "loginUsername";
	// 登录密码
	private final String PARAM_NAME_PASSWORD = "loginPassword";
	// 忽略资源
	private final String PARAM_NAME_EXCLUSIONS = "exclusions";

	private String username = "n22-comp";
	private String password = "n2288";

	private Set<String> excludesPattern;
	private ServletPathMatcher pathMatcher = new ServletPathMatcher();
	private String contextPath;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		String paramResourcePath = filterConfig.getInitParameter(PARAM_NAME_RESOURCEPATH);
		if (!StringUtils.isEmpty(paramResourcePath)) {
			this.resourcePath = paramResourcePath;
		}
		String paramLoginPath = filterConfig.getInitParameter(PARAM_NAME_LOGINPATH);
		if (!StringUtils.isEmpty(paramLoginPath)) {
			this.loginPath = paramLoginPath;
		}
		String paramLoginPage = filterConfig.getInitParameter(PARAM_NAME_LOGINPAGE);
		if (!StringUtils.isEmpty(paramLoginPage)) {
			this.loginPage = paramLoginPage;
		}
		String paramIndexPage = filterConfig.getInitParameter(PARAM_NAME_INDEXPAGE);
		if (!StringUtils.isEmpty(paramIndexPage)) {
			this.indexPage = paramIndexPage;
		}

		String paramUserName = filterConfig.getInitParameter(PARAM_NAME_USERNAME);
		if (!StringUtils.isEmpty(paramUserName)) {
			this.username = paramUserName;
		}
		String paramPassword = filterConfig.getInitParameter(PARAM_NAME_PASSWORD);
		if (!StringUtils.isEmpty(paramPassword)) {
			this.password = paramPassword;
		}
		String exclusions = filterConfig.getInitParameter(PARAM_NAME_EXCLUSIONS);
		if (exclusions != null && exclusions.trim().length() != 0) {
			excludesPattern = new HashSet<String>(Arrays.asList(exclusions.split("\\s*,\\s*")));
		}

		contextPath = getContextPath(filterConfig.getServletContext());
	}

	public boolean isExclusion(String requestURI) {
		if (excludesPattern == null) {
			return false;
		}
		if (contextPath != null && requestURI.startsWith(contextPath)) {
			requestURI = requestURI.substring(contextPath.length());
			if (!requestURI.startsWith("/")) {
				requestURI = "/" + requestURI;
			}
		}
		for (String pattern : excludesPattern) {
			if (pathMatcher.matches(pattern, requestURI)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsUser(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return session != null && session.getAttribute(SESSION_USER_KEY) != null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String reqUrl = req.getRequestURI();

		if (!reqUrl.contains(".")) {
			if (!reqUrl.endsWith("/")) {
				// 不是以"/"结尾，则重新访问,不加/否则页面请求路径会404
				resp.sendRedirect(reqUrl + "/");
				return;
			}
			// 直接访问首页
			if (reqUrl.endsWith("/")) {
				reqUrl = reqUrl.substring(0, reqUrl.length() - 1);
			}
			reqUrl += "/" + indexPage;
		}

		if (reqUrl.contains(loginPath)) {
			// 登录操作
			doLogin(req, resp);
			return;
		}

		if (isExclusion(reqUrl)) {
			// 放行url
			chain.doFilter(request, response);
			return;
		}

		if (!containsUser(req)) {
			// 未登录,输出登录页面
			String text = readFromResource(getFilePath(loginPage));
			OutUtil.print(resp, text);
			return;
		}

		if (reqUrl.contains(".html")) {
			// 访问资源文件
			String fileName = reqUrl.substring(reqUrl.lastIndexOf("/"));
			String text =readFromResource(getFilePath(fileName));
			OutUtil.print(resp, text);
			return;
		}
		chain.doFilter(request, response);
	}

	protected String getFilePath(String fileName) {
		return resourcePath + fileName;
	}

	/**
	 * @desc: 获取目标 类加载下的资源文件
	 * @auth:jackphang
	 * @date:2016年12月1日 上午9:22:31
	 * @param resourcePath
	 * @return
	 *
	 */
	protected abstract String readFromResource(String resourcePath);

	/**
	 * @desc: 登录
	 * @auth:jackphang
	 * @date:2016年10月29日 下午12:47:54
	 * @param req
	 * @param resp
	 *
	 */
	private void doLogin(HttpServletRequest req, HttpServletResponse resp) {
		String username = req.getParameter(PARAM_NAME_USERNAME);
		String password = req.getParameter(PARAM_NAME_PASSWORD);

		if (this.username.equals(username) && this.password.equals(password)) {
			req.getSession().setAttribute(SESSION_USER_KEY, true);
			OutUtil.print(resp, "SUCCESS");
			return;
		}
		OutUtil.print(resp, "用户名或密码错误");
	}

	private String getContextPath(ServletContext context) {
		String contextPath = context.getContextPath();

		if (contextPath == null || contextPath.length() == 0) {
			contextPath = "/";
		}

		return contextPath;
	}

	@Override
	public void destroy() {
	}
}
