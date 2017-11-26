package com.n22.cs.comp.common.model.bootstrap;

import java.io.Serializable;
import java.util.List;

/**
 * @desc bootstrap table 分页返回结果集
 * @author jackphang
 * @date 2016年11月26日 上午9:42:29
 */
public class BootstrapTableResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -98656168642786582L;

	private Long total = 1l;// 总数

	private List<T> rows;// 数据结果集

	public BootstrapTableResult(Long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
