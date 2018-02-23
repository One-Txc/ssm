package txc.xxy.ssm.shiro.ext.common.enums;

/**
 * @desc 状态[用户,部门,机构,角色等]
 * @author xxx
 * @date 2016年12月16日 下午4:36:04
 */
public enum StatusEnum {
	/**
	 * 冻结
	 */
	STATUS_0("0", "冻结"), //
	/**
	 * 正常
	 */
	STATUS_1("1", "正常");//

	private String value;
	private String name;

	private StatusEnum(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
