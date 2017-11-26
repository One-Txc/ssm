package com.n22.cs.comp.common.log;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

/**
 * 复写isAsSevereAsThreshold方法，实现按不同级别的日志输出到不同的目录，而不是按优先级
 * 只输出级别相同的日志，而不是输出级别大于或等于的日志
 * 
 * @author jackphang
 * @date 2016年6月9日 上午10:18:58
 * @version 1.0
 */
public class CustDailyRollingFileAppender extends DailyRollingFileAppender {

	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		return this.getThreshold().equals(priority);
	}
}
