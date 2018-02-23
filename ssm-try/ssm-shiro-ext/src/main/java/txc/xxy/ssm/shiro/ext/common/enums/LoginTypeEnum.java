package txc.xxy.ssm.shiro.ext.common.enums;

/**
 * @desc 登录类型
 * @author xxx
 * @date 2017年2月7日 上午10:38:21
 */
public enum LoginTypeEnum {

	/**
	 * 微信一键登录
	 */
	LOGIN_TYPE_0("0"), //
	/**
	 * 账号密码登录
	 */
	LOGIN_TYPE_1("1"),//
	/**
	 * 无需验证的登录---通过手机号(使用前进行了验证)
	 */
	LOGIN_TYPE_2("2")//
	;

	private String value;

	private LoginTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return value;
	}

}
