package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseMonth;
import txc.xxy.ssm.model.BaseMonthExample;

public interface BaseMonthMapper {
	int deleteByExample(BaseMonthExample example);

	int insert(BaseMonth record);

	int insertSelective(BaseMonth record);

	List<BaseMonth> selectByExample(BaseMonthExample example);

	int updateByExampleSelective(@Param("record") BaseMonth record, @Param("example") BaseMonthExample example);

	int updateByExample(@Param("record") BaseMonth record, @Param("example") BaseMonthExample example);
}