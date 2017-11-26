package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseOrg;
import txc.xxy.ssm.model.BaseOrgExample;

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