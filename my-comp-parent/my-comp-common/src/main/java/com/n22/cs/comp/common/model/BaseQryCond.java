package com.n22.cs.comp.common.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanMap;

/**
 * @description: 基础查询条件BO
 * @author: LeiJunHui
 * @date: 2016年4月17日 下午9:00:30
 */
public class BaseQryCond implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1940758291237006443L;
	private Integer pageNum = 1; // 页码
	private Integer pageSize = 10; // 页显示数[pageSize<=0 表示不分页]
	private Long oprUserId; // 操作人员ID

	private Map<String, String> param = new HashMap<String, String>();

	public BaseQryCond() {

	}

	@SuppressWarnings("unchecked")
	public BaseQryCond(Object o) {
		BeanMap beanMap = new BeanMap(o);
		param.putAll(beanMap);
	}

	public Long getOprUserId() {
		return oprUserId;
	}

	public void setOprUserId(Long oprUserId) {
		this.oprUserId = oprUserId;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Map<String, String> getParam() {
		return param;
	}

	public void put(String key, String value) {
		param.put(key, value);
	}

}
