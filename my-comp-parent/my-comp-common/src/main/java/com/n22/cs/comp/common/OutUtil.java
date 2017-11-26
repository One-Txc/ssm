package com.n22.cs.comp.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class OutUtil {

	public static void printlnSuccess(HttpServletResponse resp) {
		print(resp, "SUCCESS");
	}

	public static void printlnFail(HttpServletResponse resp) {
		print(resp, "FAIL");
	}

	public static void printlnError(HttpServletResponse resp) {
		print(resp, "ERROR");
	}

	/**
	 * @desc:out.println 输出内容并关闭out
	 * @auth:jackphang
	 * @date:2016年10月19日 下午3:51:02
	 * @param resp
	 * @param outStr
	 *
	 */
	public static void print(HttpServletResponse resp, String outStr) {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			out.print(outStr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}

	/**
	 * @desc:out.println 输出内容并关闭out
	 * @auth:jackphang
	 * @date:2016年10月19日 下午3:51:02
	 * @param resp
	 * @param outStr
	 *            正常数据
	 * @param errMsg
	 *            异常信息
	 *
	 */
	public static void print(HttpServletResponse resp, String outStr, String errMsg) {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			out.print(outStr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}
}
