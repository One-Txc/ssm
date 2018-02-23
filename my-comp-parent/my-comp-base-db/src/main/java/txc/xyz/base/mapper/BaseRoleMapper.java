package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseRole;
import txc.xyz.base.model.BaseRoleExample;

import java.util.List;

public interface BaseRoleMapper {
	int deleteByExample(BaseRoleExample example);

	int deleteByPrimaryKey(Long roleId);

	int insert(BaseRole record);

	int insertSelective(BaseRole record);

	List<BaseRole> selectByExample(BaseRoleExample example);

	BaseRole selectByPrimaryKey(Long roleId);

	int updateByExampleSelective(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

	int updateByExample(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

	int updateByPrimaryKeySelective(BaseRole record);

	int updateByPrimaryKey(BaseRole record);
}