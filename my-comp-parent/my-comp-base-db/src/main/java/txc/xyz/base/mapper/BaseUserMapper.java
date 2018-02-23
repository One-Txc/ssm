package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.BaseUserExample;

import java.util.List;

public interface BaseUserMapper {
	int deleteByExample(BaseUserExample example);

	int deleteByPrimaryKey(Long userId);

	int insert(BaseUser record);

	int insertSelective(BaseUser record);

	List<BaseUser> selectByExampleWithBLOBs(BaseUserExample example);

	List<BaseUser> selectByExample(BaseUserExample example);

	BaseUser selectByPrimaryKey(Long userId);

	int updateByExampleSelective(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

	int updateByExampleWithBLOBs(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

	int updateByExample(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

	int updateByPrimaryKeySelective(BaseUser record);

	int updateByPrimaryKeyWithBLOBs(BaseUser record);

	int updateByPrimaryKey(BaseUser record);
}