package com.n22.cs.comp.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Sha1UtilJs {
	static StringBuffer jsContent = null ;
	static ScriptEngine engine = null;
	public static String sha1(String val){
		InputStream  jsIs = null;
		InputStreamReader isr = null;
		BufferedReader bre  = null;
		try {
			if(jsContent == null){
				jsContent = new StringBuffer();
				ScriptEngineManager manager = new ScriptEngineManager();
				engine = manager.getEngineByName("javascript");
				jsIs =  Sha1UtilJs.class.getClassLoader().getResourceAsStream("sha1.js");
				isr = new InputStreamReader(jsIs);
				bre = new BufferedReader(isr); 
				String str = null;
				while ((str = bre.readLine())!= null) // 判断最后一行不存在，为空结束循环
				{
					jsContent.append(str);
				}
			}
			engine.eval(jsContent.toString());
			Object result = engine.eval("hex_sha1('" + val + "')");
			return result.toString();
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			if(bre != null){
				try {
					bre.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(isr != null){
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(jsIs != null){
				try {
					jsIs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "";
	}
}
