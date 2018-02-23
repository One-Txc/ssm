package txc.xyz.base.mapper;

import org.apache.ibatis.annotations.Param;
import txc.xyz.base.model.BaseMenu;
import txc.xyz.base.model.BaseMenuExample;

import java.util.List;

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