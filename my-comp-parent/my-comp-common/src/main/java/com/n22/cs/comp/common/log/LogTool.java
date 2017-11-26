package com.n22.cs.comp.common.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

/**
 * 日志 工具
 * @author	jackphang
 * @date	2016年6月12日 上午9:44:30 
 * @version 1.0
 */
public class LogTool {

	public static Queue<String> consoleLog = new LinkedList<String>(); // 打印队列,用于控制台输出日志
	static Logger log;

	public static void debug(Class<?> classname, String logStr) {
		log = Logger.getLogger(classname.getName());
		log.debug(logStr);
		LogTool.addToQueue(classname.getName(), logStr);
	}

	public static void info(Class<?> classname, String logStr) {
		log = Logger.getLogger(classname.getName());
		log.info(logStr);
		LogTool.addToQueue(classname.getName(), logStr);
	}

	public static void debug(Class<?> classname, Exception e) {
		LogTool.error(classname, e);
		LogTool.addToQueue(classname.getName(), getExceptionStr(e));
	}

	public static void error(Class<?> classname, Exception e) {
		log = Logger.getLogger(classname.getName());
		log.error(getExceptionStr(e));
		LogTool.addToQueue(classname.getName(), getExceptionStr(e));
	}

	public static void warn(Class<?> classname, String warn) {
		log = Logger.getLogger(classname.getName());
		log.warn(warn);
		LogTool.addToQueue(classname.getName(), warn);
	}

	public static String getExceptionStr(Exception e) {
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		e.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		return buffer.toString();
	}

	private static void addToQueue(String classname, String logStr) {
		if (consoleLog.size() > 10000) {
			consoleLog.clear();
		}
		consoleLog.offer("[" + classname + "]" + logStr);
	}

	public static String getLogQueue() {
		String logStr = consoleLog.poll();
		return logStr;
	}

}
