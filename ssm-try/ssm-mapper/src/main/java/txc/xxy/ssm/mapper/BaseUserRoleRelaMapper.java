package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseUserRoleRela;
import txc.xxy.ssm.model.BaseUserRoleRelaExample;

public interface BaseUserRoleRelaMapper {
	int deleteByExample(BaseUserRoleRelaExample example);

	int insert(BaseUserRoleRela record);

	int insertSelective(BaseUserRoleRela record);

	List<BaseUserRoleRela> selectByExample(BaseUserRoleRelaExample example);

	int updateByExampleSelective(@Param("record") BaseUserRoleRela record, @Param("example") BaseUserRoleRelaExample example);

	int updateByExample(@Param("record") BaseUserRoleRela record, @Param("example") BaseUserRoleRelaExample example);
}