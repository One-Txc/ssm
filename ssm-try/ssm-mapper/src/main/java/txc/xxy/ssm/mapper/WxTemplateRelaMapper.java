package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.WxTemplateRela;
import txc.xxy.ssm.model.WxTemplateRelaExample;

public interface WxTemplateRelaMapper {
	int deleteByExample(WxTemplateRelaExample example);

	int deleteByPrimaryKey(Long relaId);

	int insert(WxTemplateRela record);

	int insertSelective(WxTemplateRela record);

	List<WxTemplateRela> selectByExample(WxTemplateRelaExample example);

	WxTemplateRela selectByPrimaryKey(Long relaId);

	int updateByExampleSelective(@Param("record") WxTemplateRela record, @Param("example") WxTemplateRelaExample example);

	int updateByExample(@Param("record") WxTemplateRela record, @Param("example") WxTemplateRelaExample example);

	int updateByPrimaryKeySelective(WxTemplateRela record);

	int updateByPrimaryKey(WxTemplateRela record);
}