package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.ComBasic;
import txc.xyz.base.model.ComBasicExample;

import java.util.List;

public interface ComBasicMapper {
	int deleteByExample(ComBasicExample example);

	int deleteByPrimaryKey(String comId);

	int insert(ComBasic record);

	int insertSelective(ComBasic record);

	List<ComBasic> selectByExample(ComBasicExample example);

	ComBasic selectByPrimaryKey(String comId);

	int updateByExampleSelective(@Param("record") ComBasic record, @Param("example") ComBasicExample example);

	int updateByExample(@Param("record") ComBasic record, @Param("example") ComBasicExample example);

	int updateByPrimaryKeySelective(ComBasic record);

	int updateByPrimaryKey(ComBasic record);
}