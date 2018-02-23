package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseUserRoleRela;
import txc.xyz.base.model.BaseUserRoleRelaExample;

import java.util.List;

public interface BaseUserRoleRelaMapper {
	int deleteByExample(BaseUserRoleRelaExample example);

	int insert(BaseUserRoleRela record);

	int insertSelective(BaseUserRoleRela record);

	List<BaseUserRoleRela> selectByExample(BaseUserRoleRelaExample example);

	int updateByExampleSelective(@Param("record") BaseUserRoleRela record, @Param("example") BaseUserRoleRelaExample example);

	int updateByExample(@Param("record") BaseUserRoleRela record, @Param("example") BaseUserRoleRelaExample example);
}