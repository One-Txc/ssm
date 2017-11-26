package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BugList;
import txc.xxy.ssm.model.BugListExample;

public interface BugListMapper {
	int deleteByExample(BugListExample example);

	int deleteByPrimaryKey(String bugId);

	int insert(BugList record);

	int insertSelective(BugList record);

	List<BugList> selectByExample(BugListExample example);

	BugList selectByPrimaryKey(String bugId);

	int updateByExampleSelective(@Param("record") BugList record, @Param("example") BugListExample example);

	int updateByExample(@Param("record") BugList record, @Param("example") BugListExample example);

	int updateByPrimaryKeySelective(BugList record);

	int updateByPrimaryKey(BugList record);
}