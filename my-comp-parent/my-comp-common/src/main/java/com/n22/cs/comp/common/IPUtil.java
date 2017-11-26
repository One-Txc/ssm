package com.n22.cs.comp.common;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

/**
 * @desc IP工具类
 * @author jackphang
 * @date 2016年11月3日 下午7:47:45
 */
public final class IPUtil {

	private IPUtil() {
	}

	/**
	 * @desc:获取请求的ip
	 * @auth:jackphang
	 * @date:2016年11月3日 下午7:55:43
	 * @param request
	 * @return
	 *
	 */
	public static String getRemortIP(HttpServletRequest request) {
		String ipAddress = null;
		ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
			if (ipAddress.equals("127.0.0.1") || //
					ipAddress.equals("0:0:0:0:0:0:0:1")// 服务器和客户端都在同一台电脑上才会出现
			) {
				// 根据网卡取本机配置的IP
				InetAddress inet = null;
				try {
					inet = InetAddress.getLocalHost();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
				ipAddress = inet.getHostAddress();
			}

		}

		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
		if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
															// = 15
			if (ipAddress.indexOf(",") > 0) {
				ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
			}
		}
		return ipAddress;
	}

	/**
	 * @desc:判断是否是内网请求
	 * @auth:jackphang
	 * @date:2016年11月3日 下午7:55:27
	 * @param ipAddress
	 * @return
	 *
	 */
	public static boolean isInnerIP(HttpServletRequest request) {
		String ipAddress = getRemortIP(request);

		boolean isInnerIp = false;
		long ipNum = getIpNum(ipAddress);

		// 私有IP：A类 10.0.0.0-10.255.255.255
		// B类 172.16.0.0-172.31.255.255
		// C类 192.168.0.0-192.168.255.255
		// 当然，还有127这个网段是环回地址

		long aBegin = getIpNum("10.0.0.0");
		long aEnd = getIpNum("10.255.255.255");
		long bBegin = getIpNum("172.16.0.0");
		long bEnd = getIpNum("172.31.255.255");
		long cBegin = getIpNum("192.168.0.0");
		long cEnd = getIpNum("192.168.255.255");
		isInnerIp = isInner(ipNum, aBegin, aEnd) || isInner(ipNum, bBegin, bEnd) || isInner(ipNum, cBegin, cEnd)
				|| ipAddress.equals("127.0.0.1");
		return isInnerIp;
	}

	/**
	 * @desc: 获取IP数
	 * @auth:jackphang
	 * @date:2016年11月3日 下午7:54:54*
	 * @param ipAddress
	 * @return
	 *
	 */
	private static long getIpNum(String ipAddress) {
		String[] ip = ipAddress.split("\\.");
		long a = Integer.parseInt(ip[0]);
		long b = Integer.parseInt(ip[1]);
		long c = Integer.parseInt(ip[2]);
		long d = Integer.parseInt(ip[3]);

		long ipNum = a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;
		return ipNum;
	}

	private static boolean isInner(long userIp, long begin, long end) {
		return (userIp >= begin) && (userIp <= end);
	}

	/**
	 * @desc: 判断请求是否是公网域名访问,用于区分生产和本地开发环境
	 * @remark 适用于http://www.xhlgfsc.com,花生壳
	 *         http://jackphang.eicp.net,其它情况此处不作处理
	 * @auth:jackphang
	 * @date:2016年11月3日 下午8:27:32
	 * @param request
	 * @return
	 *
	 */
	public static boolean isPublicAccess(HttpServletRequest request) {
		if (80 == request.getServerPort()) {
			String serverName = request.getServerName();
			if (serverName.equals("localhost")) {
				return false;
			}
			String[] serverNames = serverName.split("\\.");
			boolean isZh = false;
			for (int i = 0; i < serverNames.length; i++) {
				Pattern pattern = Pattern.compile("[a-zA-Z]*");
				if (pattern.matcher(serverNames[i]).matches()) {
					isZh = true;
				}
			}
			if (!isZh) {// 该域名没有字母，则判断请求的ip是否是公网IP
				return !isInnerIP(request);
			}
			return true;
		}
		return false;
	}

}
