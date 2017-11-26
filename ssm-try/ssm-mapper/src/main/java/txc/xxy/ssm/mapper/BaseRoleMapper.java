package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseRole;
import txc.xxy.ssm.model.BaseRoleExample;

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