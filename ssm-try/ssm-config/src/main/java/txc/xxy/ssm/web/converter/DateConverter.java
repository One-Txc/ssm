/**
 * @Title: DateConverter.java
 * @Package com.n22.cs.demand.web.converter
 * Copyright: Copyright (c) 2016 
 * Company:
 * 
 * @author Txc
 * @date 2016年12月30日 上午11:47:59
 * @version V1.0
 */

package txc.xxy.ssm.web.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

/**
  * 类型转换器（String--->Date）
  * @ClassName: DateConverter
  * @author Txc
  * @date 2016年12月30日 上午11:47:59
  */

public class DateConverter implements Converter<String, Date>{
	private static final List<String> formarts = new ArrayList<String>(4);
	static{
		formarts.add("yyyy-MM");
		formarts.add("yyyy-MM-dd");
		formarts.add("yyyy-MM-dd hh:mm");
		formarts.add("yyyy-MM-dd hh:mm:ss");
	}
	public Date convert(String source) {
		String value = source.trim();
		if ("".equals(value)) {
			return null;
		}
		if(source.matches("^\\d{4}-\\d{1,2}$")){ 
			return parseDate(source, formarts.get(0));
		}else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
			return parseDate(source, formarts.get(1));
		}else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")){
			return parseDate(source, formarts.get(2));
		}else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")){
			return parseDate(source, formarts.get(3));
		}else {
			try{
				Long time = Long.parseLong(source);
				return new Date(time);
			}catch (Exception e) {
				throw new IllegalArgumentException("Invalid String value '" + source + "'");
			}
		}
	}

	/**
	 * 功能描述：格式化日期
	 * 
	 * @param dateStr
	 *            String 字符型日期
	 * @param format
	 *            String 格式
	 * @return Date 日期
	 */
	public  Date parseDate(String dateStr, String format) {
		Date date=null;
		try {
			DateFormat dateFormat = new SimpleDateFormat(format);
			date = (Date) dateFormat.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	public static void main(String[] args) {
		System.err.println(new DateConverter().convert("2014-64-01 45:66"));
	}
}
