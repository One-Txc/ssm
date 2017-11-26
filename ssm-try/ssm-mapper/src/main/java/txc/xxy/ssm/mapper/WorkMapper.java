package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.Work;
import txc.xxy.ssm.model.WorkExample;

public interface WorkMapper {
	int deleteByExample(WorkExample example);

	int deleteByPrimaryKey(String workId);

	int insert(Work record);

	int insertSelective(Work record);

	List<Work> selectByExample(WorkExample example);

	Work selectByPrimaryKey(String workId);

	int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

	int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

	int updateByPrimaryKeySelective(Work record);

	int updateByPrimaryKey(Work record);
}