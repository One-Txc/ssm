package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseDict;
import txc.xyz.base.model.BaseDictExample;

import java.util.List;

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