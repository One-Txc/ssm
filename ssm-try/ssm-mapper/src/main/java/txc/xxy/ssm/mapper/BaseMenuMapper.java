package txc.xxy.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import txc.xxy.ssm.model.BaseMenu;
import txc.xxy.ssm.model.BaseMenuExample;

public interface BaseMenuMapper {
	int deleteByExample(BaseMenuExample example);

	int deleteByPrimaryKey(Long menuId);

	int insert(BaseMenu record);

	int insertSelective(BaseMenu record);

	List<BaseMenu> selectByExample(BaseMenuExample example);

	BaseMenu selectByPrimaryKey(Long menuId);

	int updateByExampleSelective(@Param("record") BaseMenu record, @Param("example") BaseMenuExample example);

	int updateByExample(@Param("record") BaseMenu record, @Param("example") BaseMenuExample example);

	int updateByPrimaryKeySelective(BaseMenu record);

	int updateByPrimaryKey(BaseMenu record);
}