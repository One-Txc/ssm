package txc.xxy.ssm.shiro.ext.authc;

import java.util.LinkedHashMap;
import java.util.Map;

import com.n22.cs.comp.common.log.LogTool;
import com.n22.cs.comp.redis.JedisClient;
import com.n22.cs.comp.shiro.AbstractFilterChainDefinitionsService;

/**
 * 动态加载其它 权限资源配置服务类
 * 
 * @author jackphang
 * @date 2016年4月14日 下午12:00:54
 * @version 1.0
 */
public class UserFilterChainDefinitionsService extends AbstractFilterChainDefinitionsService {

	private JedisClient jedisClient;

	/**
	 * 扩展的拦截规则,容器启动时从DB中读取并按角色分类放入shiro缓存中
	 * 
	 * @author : jackphang
	 * @date :2016年4月15日 上午8:42:09
	 */
	@Override
	public Map<String, String> initOtherPermission() {
		Map<String, String> permissionMap = new LinkedHashMap<>();
		/*Set<String> keys = jedisClient.keys(RedisKeyConstant.ROLE_MENU_RELA_PREFIX + "*");
		for (String key : keys) {
			// 获取角色ID
			String roleId = key.substring(key.lastIndexOf(":") + 1);
			// 角色对应权限资源
			List<RoleMenuExt> roleMenuRelaList = jedisClient.getList(key, RoleMenuExt.class);
			for (RoleMenuExt roleMenuExt : roleMenuRelaList) {
				if (StringUtils.isBlank(roleMenuExt.getMenuUrl()) || Objects.equals("#", roleMenuExt.getMenuUrl())) {
					continue;
				}
				// 同一资源多个角色
				String roles = permissionMap.get(roleMenuExt.getMenuUrl());
				if (StringUtils.isBlank(roles)) {
					// 所有的url都赋予给admin角色
					permissionMap.put(roleMenuExt.getMenuUrl(), "roles[" + roleId + ",admin]");
				} else {
					// 删除 "]"
					roles = roles.substring(0, roles.length() - 1);
					roles += "," + roleId + "]";
					permissionMap.put(roleMenuExt.getMenuUrl(), roles);
				}
			}
		}*/
		//permissionMap.put("/**/*.htm", "roles[admin]");
		//permissionMap.put("/**/*.ajax", "roles[admin]");
		LogTool.debug(getClass(), ">>>>>>成功初始化角色-权限关系数据" );
		return permissionMap;
	}

	public JedisClient getJedisClient() {
		return jedisClient;
	}

	public void setJedisClient(JedisClient jedisClient) {
		this.jedisClient = jedisClient;
	}

}