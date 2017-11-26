package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.HolidayConfig;
import txc.xxy.ssm.model.HolidayConfigExample;

public interface HolidayConfigMapper {
	int deleteByExample(HolidayConfigExample example);

	int deleteByPrimaryKey(String sid);

	int insert(HolidayConfig record);

	int insertSelective(HolidayConfig record);

	List<HolidayConfig> selectByExample(HolidayConfigExample example);

	HolidayConfig selectByPrimaryKey(String sid);

	int updateByExampleSelective(@Param("record") HolidayConfig record, @Param("example") HolidayConfigExample example);

	int updateByExample(@Param("record") HolidayConfig record, @Param("example") HolidayConfigExample example);

	int updateByPrimaryKeySelective(HolidayConfig record);

	int updateByPrimaryKey(HolidayConfig record);
}