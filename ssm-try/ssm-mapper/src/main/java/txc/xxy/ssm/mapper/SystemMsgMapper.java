package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.SystemMsg;
import txc.xxy.ssm.model.SystemMsgExample;

public interface SystemMsgMapper {
	int deleteByExample(SystemMsgExample example);

	int deleteByPrimaryKey(String msgId);

	int insert(SystemMsg record);

	int insertSelective(SystemMsg record);

	List<SystemMsg> selectByExample(SystemMsgExample example);

	SystemMsg selectByPrimaryKey(String msgId);

	int updateByExampleSelective(@Param("record") SystemMsg record, @Param("example") SystemMsgExample example);

	int updateByExample(@Param("record") SystemMsg record, @Param("example") SystemMsgExample example);

	int updateByPrimaryKeySelective(SystemMsg record);

	int updateByPrimaryKey(SystemMsg record);
}