package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.IntroducerInfo;
import txc.xxy.ssm.model.IntroducerInfoExample;

public interface IntroducerInfoMapper {
	int deleteByExample(IntroducerInfoExample example);

	int deleteByPrimaryKey(String introducerUid);

	int insert(IntroducerInfo record);

	int insertSelective(IntroducerInfo record);

	List<IntroducerInfo> selectByExample(IntroducerInfoExample example);

	IntroducerInfo selectByPrimaryKey(String introducerUid);

	int updateByExampleSelective(@Param("record") IntroducerInfo record, @Param("example") IntroducerInfoExample example);

	int updateByExample(@Param("record") IntroducerInfo record, @Param("example") IntroducerInfoExample example);

	int updateByPrimaryKeySelective(IntroducerInfo record);

	int updateByPrimaryKey(IntroducerInfo record);
}