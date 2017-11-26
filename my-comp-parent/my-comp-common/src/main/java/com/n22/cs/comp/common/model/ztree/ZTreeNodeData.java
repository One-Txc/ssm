package com.n22.cs.comp.common.model.ztree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @desc Ztree 返回的数据格式
 * @author jackphang
 * @date 2016年12月21日 上午9:35:12
 */
public class ZTreeNodeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5840251246496987320L;

	private String id;
	private Object zNode;// 节点其它数据
	private String name;
	private String code;
	private Boolean open;
	private String parentId;
	private String icon;// 图标
	private Boolean nocheck = true;// 是否显示多选框
	// 孩子节点数据
	private List<ZTreeNodeData> children = new ArrayList<>();

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getzNode() {
		return zNode;
	}

	public void setzNode(Object zNode) {
		this.zNode = zNode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ZTreeNodeData> getChildren() {
		return children;
	}

	public void setChildren(List<ZTreeNodeData> children) {
		this.children = children;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Boolean getNocheck() {
		return nocheck;
	}

	public void setNocheck(Boolean nocheck) {
		this.nocheck = nocheck;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// 先序遍历，拼接JSON字符串
	public String toString() {
		String result = "{" + "id : '" + id + "'" + ", name : '" + name + "'";

		if (children != null && children.size() != 0) {
			result += ", children : " + children.toString();
		} else {
			result += ", leaf : true";
		}

		return result + "}";
	}

	// 添加孩子节点
	public void addChild(ZTreeNodeData node) {
		this.children.add(node);
	}

}
