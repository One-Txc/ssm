package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseRoleMenuRela;
import txc.xyz.base.model.BaseRoleMenuRelaExample;

import java.util.List;

public interface BaseRoleMenuRelaMapper {
	int deleteByExample(BaseRoleMenuRelaExample example);

	int insert(BaseRoleMenuRela record);

	int insertSelective(BaseRoleMenuRela record);

	List<BaseRoleMenuRela> selectByExample(BaseRoleMenuRelaExample example);

	int updateByExampleSelective(@Param("record") BaseRoleMenuRela record, @Param("example") BaseRoleMenuRelaExample example);

	int updateByExample(@Param("record") BaseRoleMenuRela record, @Param("example") BaseRoleMenuRelaExample example);
}