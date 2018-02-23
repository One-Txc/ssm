package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.WxTemplateRela;
import txc.xyz.base.model.WxTemplateRelaExample;

import java.util.List;

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