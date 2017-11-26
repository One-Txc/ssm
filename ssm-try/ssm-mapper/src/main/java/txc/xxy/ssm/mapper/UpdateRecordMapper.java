package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.UpdateRecord;
import txc.xxy.ssm.model.UpdateRecordExample;

public interface UpdateRecordMapper {
	int deleteByExample(UpdateRecordExample example);

	int deleteByPrimaryKey(String sid);

	int insert(UpdateRecord record);

	int insertSelective(UpdateRecord record);

	List<UpdateRecord> selectByExample(UpdateRecordExample example);

	UpdateRecord selectByPrimaryKey(String sid);

	int updateByExampleSelective(@Param("record") UpdateRecord record, @Param("example") UpdateRecordExample example);

	int updateByExample(@Param("record") UpdateRecord record, @Param("example") UpdateRecordExample example);

	int updateByPrimaryKeySelective(UpdateRecord record);

	int updateByPrimaryKey(UpdateRecord record);
}