package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.TaskInfo;
import txc.xxy.ssm.model.TaskInfoExample;

public interface TaskInfoMapper {
	int deleteByExample(TaskInfoExample example);

	int deleteByPrimaryKey(String taskNo);

	int insert(TaskInfo record);

	int insertSelective(TaskInfo record);

	List<TaskInfo> selectByExample(TaskInfoExample example);

	TaskInfo selectByPrimaryKey(String taskNo);

	int updateByExampleSelective(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

	int updateByExample(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

	int updateByPrimaryKeySelective(TaskInfo record);

	int updateByPrimaryKey(TaskInfo record);
}