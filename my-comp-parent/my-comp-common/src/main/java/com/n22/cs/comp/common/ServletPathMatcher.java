package com.n22.cs.comp.common;

/**
 * @desc 用于匹配请求路径
 * @author xxx
 * @date 2016年10月29日 下午12:59:25
 */
public class ServletPathMatcher {

	private final static ServletPathMatcher INSTANCE = new ServletPathMatcher();

	public static ServletPathMatcher getInstance() {
		return INSTANCE;
	}

	/**
	 * @desc: 三种类型: endsWithMatch(eg. /xxx*=/xxx/xyz), startsWithMatch(eg.
	 *        *.xxx=abc.xxx), equals(eg. /xxx=/xxx).
	 * @notice : *xxx* 将会匹配 *xxxyyyy. endsWithMatch first.
	 * @auth:xxx
	 * @date:2016年10月29日 下午1:02:08
	 * @param pattern
	 * @param source
	 * @return
	 *
	 */
	public boolean matches(String pattern, String source) {
		if (pattern == null || source == null) {
			return false;
		}
		pattern = pattern.trim();
		source = source.trim();
		if (pattern.endsWith("*")) {
			// pattern: /comp* source:/comp/index.html
			int length = pattern.length() - 1;
			if (source.length() >= length) {
				if (pattern.substring(0, length).equals(source.substring(0, length))) {
					return true;
				}
			}
		} else if (pattern.startsWith("*")) {
			// pattern: *.html source:/xx/xx.html
			int length = pattern.length() - 1;
			if (source.length() >= length && source.endsWith(pattern.substring(1))) {
				return true;
			}
		} else if (pattern.contains("*")) {
			// pattern: /comp/*/index.html source:/comp/admin/index.html
			int start = pattern.indexOf("*");
			int end = pattern.lastIndexOf("*");
			if (source.startsWith(pattern.substring(0, start)) && source.endsWith(pattern.substring(end + 1))) {
				return true;
			}
		} else {
			// pattern: /comp/index.html source:/comp/index.html
			if (pattern.equals(source)) {
				return true;
			}
		}
		return false;
	}

}
