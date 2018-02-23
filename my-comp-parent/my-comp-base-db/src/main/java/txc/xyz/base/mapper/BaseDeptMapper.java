package txc.xyz.base.mapper;


import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseDept;
import txc.xyz.base.model.BaseDeptExample;

import java.util.List;

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