package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseOrg;
import txc.xyz.base.model.BaseOrgExample;

import java.util.List;

public interface BaseOrgMapper {
	int deleteByExample(BaseOrgExample example);

	int deleteByPrimaryKey(Long orgId);

	int insert(BaseOrg record);

	int insertSelective(BaseOrg record);

	List<BaseOrg> selectByExample(BaseOrgExample example);

	BaseOrg selectByPrimaryKey(Long orgId);

	int updateByExampleSelective(@Param("record") BaseOrg record, @Param("example") BaseOrgExample example);

	int updateByExample(@Param("record") BaseOrg record, @Param("example") BaseOrgExample example);

	int updateByPrimaryKeySelective(BaseOrg record);

	int updateByPrimaryKey(BaseOrg record);
}