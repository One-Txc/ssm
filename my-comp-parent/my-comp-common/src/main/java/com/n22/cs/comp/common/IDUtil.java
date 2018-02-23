package com.n22.cs.comp.common;

import java.util.Random;

import org.joda.time.DateTime;

/**
 * @desc ID生成工具类
 * @author xxx
 * @date 2016年11月24日 下午4:19:09
 */
public class IDUtil {
	/**
	 * 各表ID生成均可用
	 * 
	 * @author : xxx
	 * @date :2016年6月15日 上午8:12:39
	 */
	public static String genId() {
		return genId("");
	}

	/**
	 * ID 生成规则:业务字段+yyMMdd+当天的触发的时间毫秒数+4位随机码
	 * 
	 * @param:bizField 业务字段
	 * @author : xxx
	 * @date :2016年6月14日 下午3:01:14
	 */
	public static String genId(String bizField) {
		DateTime now = DateTime.now();
		String nowStr = now.toString("yyyyMMdd");
		Integer randomNum = nextInt(1000, 9999);

		String secondsOfDay = String.format("%06d", now.getSecondOfDay());
		return bizField + nowStr + secondsOfDay + randomNum;
	}

	/**
	 * @desc:
	 * @auth:xxx
	 * @date:2016年12月12日 下午2:58:48
	 * @param bizField
	 *            业务字段
	 * @param pattern
	 *            日期格式
	 * @return
	 *
	 */
	public static String genId(String bizField, String pattern) {
		DateTime now = DateTime.now();
		String nowStr = now.toString(pattern);
		Integer randomNum = nextInt(1000, 9999);

		String secondsOfDay = String.format("%06d", now.getSecondOfDay());
		return bizField + nowStr + secondsOfDay + randomNum;
	}

	/**
	 * 普通订单号
	 * 
	 * @author : xxx
	 * @date :2016年6月14日 下午3:20:29
	 */
	public static String getOrderNo() {
		return genId("");
	}

	/**
	 * 生成固定长度的随机数
	 * 
	 * @param min:1000000
	 * @param max:9999999
	 *            表示生成7位固定长度的随机数
	 * @author : xxx
	 * @date :2016年6月10日 下午10:21:39
	 */
	private static int nextInt(final int min, final int max) {
		Random rand = new Random();
		Integer tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}

	/**
	 * @desc: 创建指定长度随机码
	 * @auth:xxx
	 * @date:2016年11月4日 下午1:32:53
	 * @param length
	 * @return
	 *
	 */
	public static String createCode(Integer length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			Random random = new Random();
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(genId());
	}
}
