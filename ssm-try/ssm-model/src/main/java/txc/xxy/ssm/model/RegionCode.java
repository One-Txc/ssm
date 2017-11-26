package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName region_code
  * @Description: 省市区码表
  * @author Txc
  * @date 2017-04-27
  */
public class RegionCode implements Serializable {
	private Long regionId;		//行政区划id

	private String regionCode;		//行政区划代码

	private String regionName;		//行政区划名称

	private Long parentId;		//父行政区划

	private Integer regionLevel;		//层级

	private Integer regionOrder;		//排序，用来调整顺序

	private String regionNameEn;		//行政区划英文名称

	private static final long serialVersionUID = 1L;

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode == null ? null : regionCode.trim();
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName == null ? null : regionName.trim();
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getRegionLevel() {
		return regionLevel;
	}

	public void setRegionLevel(Integer regionLevel) {
		this.regionLevel = regionLevel;
	}

	public Integer getRegionOrder() {
		return regionOrder;
	}

	public void setRegionOrder(Integer regionOrder) {
		this.regionOrder = regionOrder;
	}

	public String getRegionNameEn() {
		return regionNameEn;
	}

	public void setRegionNameEn(String regionNameEn) {
		this.regionNameEn = regionNameEn == null ? null : regionNameEn.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("regionId=").append(regionId);
		sb.append(", regionCode=").append(regionCode);
		sb.append(", regionName=").append(regionName);
		sb.append(", parentId=").append(parentId);
		sb.append(", regionLevel=").append(regionLevel);
		sb.append(", regionOrder=").append(regionOrder);
		sb.append(", regionNameEn=").append(regionNameEn);
		sb.append("]");
		return sb.toString();
	}
}