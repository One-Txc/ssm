package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.ComBasic;
import txc.xxy.ssm.model.ComBasicExample;

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