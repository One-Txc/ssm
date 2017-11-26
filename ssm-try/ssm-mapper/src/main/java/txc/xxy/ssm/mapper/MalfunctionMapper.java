package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.Malfunction;
import txc.xxy.ssm.model.MalfunctionExample;
import txc.xxy.ssm.model.MalfunctionWithBLOBs;

public interface MalfunctionMapper {
	int deleteByExample(MalfunctionExample example);

	int deleteByPrimaryKey(String malfNo);

	int insert(MalfunctionWithBLOBs record);

	int insertSelective(MalfunctionWithBLOBs record);

	List<MalfunctionWithBLOBs> selectByExampleWithBLOBs(MalfunctionExample example);

	List<Malfunction> selectByExample(MalfunctionExample example);

	MalfunctionWithBLOBs selectByPrimaryKey(String malfNo);

	int updateByExampleSelective(@Param("record") MalfunctionWithBLOBs record, @Param("example") MalfunctionExample example);

	int updateByExampleWithBLOBs(@Param("record") MalfunctionWithBLOBs record, @Param("example") MalfunctionExample example);

	int updateByExample(@Param("record") Malfunction record, @Param("example") MalfunctionExample example);

	int updateByPrimaryKeySelective(MalfunctionWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MalfunctionWithBLOBs record);

	int updateByPrimaryKey(Malfunction record);
}