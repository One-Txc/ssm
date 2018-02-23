package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.WxBaseConfig;
import txc.xyz.base.model.WxBaseConfigExample;

import java.util.List;

public interface WxBaseConfigMapper {
	int deleteByExample(WxBaseConfigExample example);

	int deleteByPrimaryKey(Long sysId);

	int insert(WxBaseConfig record);

	int insertSelective(WxBaseConfig record);

	List<WxBaseConfig> selectByExample(WxBaseConfigExample example);

	WxBaseConfig selectByPrimaryKey(Long sysId);

	int updateByExampleSelective(@Param("record") WxBaseConfig record, @Param("example") WxBaseConfigExample example);

	int updateByExample(@Param("record") WxBaseConfig record, @Param("example") WxBaseConfigExample example);

	int updateByPrimaryKeySelective(WxBaseConfig record);

	int updateByPrimaryKey(WxBaseConfig record);
}