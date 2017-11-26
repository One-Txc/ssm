package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseDept;
import txc.xxy.ssm.model.BaseDeptExample;

public interface BaseDeptMapper {
	int deleteByExample(BaseDeptExample example);

	int deleteByPrimaryKey(Long deptId);

	int insert(BaseDept record);

	int insertSelective(BaseDept record);

	List<BaseDept> selectByExample(BaseDeptExample example);

	BaseDept selectByPrimaryKey(Long deptId);

	int updateByExampleSelective(@Param("record") BaseDept record, @Param("example") BaseDeptExample example);

	int updateByExample(@Param("record") BaseDept record, @Param("example") BaseDeptExample example);

	int updateByPrimaryKeySelective(BaseDept record);

	int updateByPrimaryKey(BaseDept record);
}