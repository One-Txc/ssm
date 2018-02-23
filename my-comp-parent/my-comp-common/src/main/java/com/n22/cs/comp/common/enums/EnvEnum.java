package com.n22.cs.comp.common.enums;

/**
 * @desc 环境枚举
 * @author xxx
 * @date 2017年1月19日 上午10:48:04
 */
public enum EnvEnum {

	/**
	 * 开发环境
	 */
	DEV("dev"), //
	/**
	 * 测试环境
	 */
	TEST("test"), //
	/**
	 * 生产环境
	 */
	PRO("pro");

	private String value;

	private EnvEnum(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public String getValue() {
		return value;
	}
}
