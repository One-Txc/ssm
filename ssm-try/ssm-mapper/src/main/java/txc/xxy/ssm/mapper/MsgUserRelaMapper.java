package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.MsgUserRela;
import txc.xxy.ssm.model.MsgUserRelaExample;

public interface MsgUserRelaMapper {
	int deleteByExample(MsgUserRelaExample example);

	int insert(MsgUserRela record);

	int insertSelective(MsgUserRela record);

	List<MsgUserRela> selectByExample(MsgUserRelaExample example);

	int updateByExampleSelective(@Param("record") MsgUserRela record, @Param("example") MsgUserRelaExample example);

	int updateByExample(@Param("record") MsgUserRela record, @Param("example") MsgUserRelaExample example);
}