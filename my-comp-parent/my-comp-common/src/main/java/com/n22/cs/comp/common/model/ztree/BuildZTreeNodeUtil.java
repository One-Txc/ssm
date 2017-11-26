package com.n22.cs.comp.common.model.ztree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * @desc 构建ztree 树形结构数据 工具 类
 * @author jackphang
 * @date 2016年12月22日 上午9:58:06
 */
public class BuildZTreeNodeUtil {

	/**
	 * @desc:构建ztree树形结构数据
	 * @auth:jackphang
	 * @date:2016年12月22日 上午9:58:28
	 * @param ztreeList
	 *            数据集合列表，必须包含ZTreeNodeData相关属性数据
	 * @return
	 *
	 */
	public static List<ZTreeNodeData> build(List<ZTreeNodeData> ztreeList) {
		// 节点列表（散列表，用于临时存储节点对象）
		Map<String, ZTreeNodeData> nodeMap = new LinkedHashMap<>();
		// 根节点
		List<ZTreeNodeData> rootList = new ArrayList<>();
		// 根据结果集构造节点列表（存入散列表）
		for (Iterator<ZTreeNodeData> iter = ztreeList.iterator(); iter.hasNext();) {
			ZTreeNodeData node = iter.next();
			nodeMap.put(node.getId(), node);
		}
		// 构造无序的多叉树
		Set<Entry<String, ZTreeNodeData>> entrySet = nodeMap.entrySet();
		for (Iterator<Entry<String, ZTreeNodeData>> iter = entrySet.iterator(); iter.hasNext();) {
			ZTreeNodeData node = iter.next().getValue();
			if (StringUtils.isBlank(node.getParentId())) {
				node.setOpen(true);
				rootList.add(node);
			} else {
				nodeMap.get(node.getParentId()).addChild(node);
			}
		}
		return rootList;
	}

	/**
	 * @desc: 构建ztree树形结构数据
	 * @auth:jackphang
	 * @date:2016年12月22日 上午10:02:09
	 * @param nodeMap
	 *            根据结果集构造节点列表（存入散列表）key=parentId,value=ZTreeNodeData
	 * @return
	 *
	 */
	public static List<ZTreeNodeData> build(Map<String, ZTreeNodeData> nodeMap) {
		// 根节点
		List<ZTreeNodeData> rootList = new ArrayList<>();
		// 构造无序的多叉树
		Set<Entry<String, ZTreeNodeData>> entrySet = nodeMap.entrySet();
		for (Iterator<Entry<String, ZTreeNodeData>> iter = entrySet.iterator(); iter.hasNext();) {
			ZTreeNodeData node = iter.next().getValue();
			if (StringUtils.isBlank(node.getParentId())) {
				node.setOpen(true);
				rootList.add(node);
			} else {
				if(nodeMap.get(node.getParentId()) != null){
					nodeMap.get(node.getParentId()).addChild(node);
				}
			}
		}
		return rootList;
	}
}
