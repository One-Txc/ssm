package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName base_menu
  * @Description: 菜单表
  * @author Txc
  * @date 2017-04-27
  */
public class BaseMenu implements Serializable {
	private Long menuId;		//菜单ID

	private Long parentId;		//父级菜单ID

	private String menuName;		//菜单名称

	private String menuCode;		//菜单代码

	private String menuDesc;		//菜单描述

	private String menuUrl;		//菜单链接

	private String menuType;		//菜单类型[0-菜单,1-跳转类型按钮,2-提交类型按钮]

	private String menuLevel;		//菜单级别

	private String clientType;		//所属客户端[web,ios,android]

	private String isShow;		//是否显示[0-否,1-是]

	private String isPublic;		//是否公开(0-否,1-是)

	private String iconfontName;		//图标名称Hui-iconfont

	private String className;		//样式名称

	private String layoutCode;		//布局分类code

	private Integer orderNo;		//排序号

	private String validFlag;		//有效标识

	private Timestamp createTime;		//创建时间

	private Timestamp updateTime;		//更新时间

	private Long createUid;		//创建者ID

	private Long updateUid;		//更新者ID

	private static final long serialVersionUID = 1L;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName == null ? null : menuName.trim();
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode == null ? null : menuCode.trim();
	}

	public String getMenuDesc() {
		return menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc == null ? null : menuDesc.trim();
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl == null ? null : menuUrl.trim();
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType == null ? null : menuType.trim();
	}

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel == null ? null : menuLevel.trim();
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType == null ? null : clientType.trim();
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow == null ? null : isShow.trim();
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic == null ? null : isPublic.trim();
	}

	public String getIconfontName() {
		return iconfontName;
	}

	public void setIconfontName(String iconfontName) {
		this.iconfontName = iconfontName == null ? null : iconfontName.trim();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className == null ? null : className.trim();
	}

	public String getLayoutCode() {
		return layoutCode;
	}

	public void setLayoutCode(String layoutCode) {
		this.layoutCode = layoutCode == null ? null : layoutCode.trim();
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag == null ? null : validFlag.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCreateUid() {
		return createUid;
	}

	public void setCreateUid(Long createUid) {
		this.createUid = createUid;
	}

	public Long getUpdateUid() {
		return updateUid;
	}

	public void setUpdateUid(Long updateUid) {
		this.updateUid = updateUid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("menuId=").append(menuId);
		sb.append(", parentId=").append(parentId);
		sb.append(", menuName=").append(menuName);
		sb.append(", menuCode=").append(menuCode);
		sb.append(", menuDesc=").append(menuDesc);
		sb.append(", menuUrl=").append(menuUrl);
		sb.append(", menuType=").append(menuType);
		sb.append(", menuLevel=").append(menuLevel);
		sb.append(", clientType=").append(clientType);
		sb.append(", isShow=").append(isShow);
		sb.append(", isPublic=").append(isPublic);
		sb.append(", iconfontName=").append(iconfontName);
		sb.append(", className=").append(className);
		sb.append(", layoutCode=").append(layoutCode);
		sb.append(", orderNo=").append(orderNo);
		sb.append(", validFlag=").append(validFlag);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", createUid=").append(createUid);
		sb.append(", updateUid=").append(updateUid);
		sb.append("]");
		return sb.toString();
	}
}