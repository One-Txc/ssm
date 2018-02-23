package txc.xyz.base.mapper.cust;

import txc.xyz.base.model.cust.RoleAuthCust;

import java.util.List;

/**
 * @author: txc
 * @date: 18-2-23 上午9:47
 */
public interface BaseMenuCustMapper {
    /**
     * 查询所有的角色菜单配置
     * 用来初始化shiro的权限配置
     * @return
     */
    List<RoleAuthCust> getAllMenuRole();
}
