package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.Demand;
import txc.xxy.ssm.model.DemandExample;

public interface DemandMapper {
	int deleteByExample(DemandExample example);

	int deleteByPrimaryKey(String demandNo);

	int insert(Demand record);

	int insertSelective(Demand record);

	List<Demand> selectByExample(DemandExample example);

	Demand selectByPrimaryKey(String demandNo);

	int updateByExampleSelective(@Param("record") Demand record, @Param("example") DemandExample example);

	int updateByExample(@Param("record") Demand record, @Param("example") DemandExample example);

	int updateByPrimaryKeySelective(Demand record);

	int updateByPrimaryKey(Demand record);
}