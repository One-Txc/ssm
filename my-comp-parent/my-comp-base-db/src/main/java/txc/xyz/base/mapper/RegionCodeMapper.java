package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.RegionCode;
import txc.xyz.base.model.RegionCodeExample;

import java.util.List;

public interface RegionCodeMapper {
	int deleteByExample(RegionCodeExample example);

	int deleteByPrimaryKey(Long regionId);

	int insert(RegionCode record);

	int insertSelective(RegionCode record);

	List<RegionCode> selectByExample(RegionCodeExample example);

	RegionCode selectByPrimaryKey(Long regionId);

	int updateByExampleSelective(@Param("record") RegionCode record, @Param("example") RegionCodeExample example);

	int updateByExample(@Param("record") RegionCode record, @Param("example") RegionCodeExample example);

	int updateByPrimaryKeySelective(RegionCode record);

	int updateByPrimaryKey(RegionCode record);
}