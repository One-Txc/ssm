package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseDict;
import txc.xxy.ssm.model.BaseDictExample;

public interface BaseDictMapper {
	int deleteByExample(BaseDictExample example);

	int deleteByPrimaryKey(Long id);

	int insert(BaseDict record);

	int insertSelective(BaseDict record);

	List<BaseDict> selectByExample(BaseDictExample example);

	BaseDict selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

	int updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

	int updateByPrimaryKeySelective(BaseDict record);

	int updateByPrimaryKey(BaseDict record);
}