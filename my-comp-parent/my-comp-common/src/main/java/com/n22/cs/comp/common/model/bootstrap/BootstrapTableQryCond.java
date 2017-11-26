package com.n22.cs.comp.common.model.bootstrap;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * @desc bootstrap table 查询通用条件,使用者请继承该类
 * @author jackphang
 * @date 2016年11月26日 上午11:07:17
 */
public class BootstrapTableQryCond implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8394182398286295942L;

	private Integer pageNum=1;// 页码
	private Integer pageSize=10;// 每页显示数
	private String sortColumn;// 排序字段
	private String sortRule;// 排序规则

	// bootstrap table 默认的参数
	public void setParams(String params) {
		initParams(params);
	}

	/**
	 * 初始化参数
	 */
	private void initParams(String params) {
		JSONObject jsonObject = JSONObject.parseObject(params);
		// bootstrap table queryParamsType使用的是limit，则必有以下参数
		if (jsonObject.containsKey("limit")) {
			pageSize = jsonObject.getInteger("limit");
			pageNum = jsonObject.getInteger("offset") / pageSize + 1;
			if (jsonObject.containsKey("sort")) {
				sortColumn = jsonObject.getString("sort");
				sortRule = jsonObject.getString("order");
			}
		}
		if (jsonObject.containsKey("pageSize")) {
			pageSize = jsonObject.getInteger("pageSize");
			pageNum = jsonObject.getInteger("pageNumber");
			if (jsonObject.containsKey("sortName")) {
				sortColumn = jsonObject.getString("sortName");
				sortRule = jsonObject.getString("sortOrder");
			}
		}

	}

	public Integer getPageNum() {
		return pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortColumn() {
		return sortColumn;
	}

	public String getSortRule() {
		return sortRule;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public void setSortRule(String sortRule) {
		this.sortRule = sortRule;
	}

}