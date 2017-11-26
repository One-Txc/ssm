/**
 * @Title: TimeConvertr.java
 * @Package com.n22.cs.demand.web.converter
 * @Description: TODO
 * Copyright: Copyright (c) 2016 
 * Company:
 * 
 * @author Txc
 * @date 2016年12月30日 上午11:22:53
 * @version V1.0
 */

package txc.xxy.ssm.web.converter;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

/**
  * 类型转换器（String--->Timestamp）
  * @ClassName: TimeConvertr
  * @author Txc
  * @date 2016年12月30日 上午11:22:53
  */
public class TimestampConvertr implements Converter<String, Timestamp>{
	
	private static final List<String> formarts = new ArrayList<String>(4);
	static{
		formarts.add("yyyy-MM");
		formarts.add("yyyy-MM-dd");
		formarts.add("yyyy-MM-dd hh:mm");
		formarts.add("yyyy-MM-dd hh:mm:ss");
	}
	public Timestamp convert(String source) {
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
		}else{
			try{
				Long time = Long.parseLong(source);
				return new Timestamp(time);
			}catch (Exception e) {
				throw new IllegalArgumentException("Invalid String value '" + source + "'");
			}
		}
	}


	public  Timestamp parseDate(String dateStr, String format) {
		Date date=null;
		Timestamp timestamp = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat(format);
			date = (Date) dateFormat.parse(dateStr);
			timestamp = new Timestamp(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return timestamp;
	}
	public static void main(String[] args) {
		System.out.println(new DateConverter().convert("121qrq241241"));
	}
	

}
