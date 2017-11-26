package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.FileDetail;
import txc.xxy.ssm.model.FileDetailExample;

public interface FileDetailMapper {
	int deleteByExample(FileDetailExample example);

	int deleteByPrimaryKey(Long docId);

	int insert(FileDetail record);

	int insertSelective(FileDetail record);

	List<FileDetail> selectByExample(FileDetailExample example);

	FileDetail selectByPrimaryKey(Long docId);

	int updateByExampleSelective(@Param("record") FileDetail record, @Param("example") FileDetailExample example);

	int updateByExample(@Param("record") FileDetail record, @Param("example") FileDetailExample example);

	int updateByPrimaryKeySelective(FileDetail record);

	int updateByPrimaryKey(FileDetail record);
}