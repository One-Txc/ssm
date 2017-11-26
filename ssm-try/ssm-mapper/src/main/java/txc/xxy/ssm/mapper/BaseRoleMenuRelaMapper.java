package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseRoleMenuRela;
import txc.xxy.ssm.model.BaseRoleMenuRelaExample;

public interface BaseRoleMenuRelaMapper {
	int deleteByExample(BaseRoleMenuRelaExample example);

	int insert(BaseRoleMenuRela record);

	int insertSelective(BaseRoleMenuRela record);

	List<BaseRoleMenuRela> selectByExample(BaseRoleMenuRelaExample example);

	int updateByExampleSelective(@Param("record") BaseRoleMenuRela record, @Param("example") BaseRoleMenuRelaExample example);

	int updateByExample(@Param("record") BaseRoleMenuRela record, @Param("example") BaseRoleMenuRelaExample example);
}