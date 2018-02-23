package com.n22.cs.comp.shiro;

import com.n22.cs.comp.common.log.LogTool;
import com.n22.cs.comp.redis.JedisClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.config.Ini;
import org.apache.shiro.config.Ini.Section;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import txc.xyz.base.mapper.BaseMenuMapper;
import txc.xyz.base.mapper.cust.BaseMenuCustMapper;
import txc.xyz.base.model.cust.RoleAuthCust;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * 安全框架角色资源配置服务类 继承该类、可实现定制化的权限拦截
 * 
 * @author xxx
 * @date 2016年4月14日 上午11:57:28
 * @version 1.0
 */
public class DefualtFilterChainDefinitionsService implements FilterChainDefinitionsService {

	private String definitions = "";

	@Autowired
	private ShiroFilterFactoryBean shiroFilterFactoryBean;
	@Autowired
	private CustRolesAuthorizationFilter custRolesAuthorizationFilter;
	@Autowired
	private JedisClient jedisClient;
	@Autowired
	private BaseMenuMapper menuMapper;
	@Autowired
	private BaseMenuCustMapper MenuCustMapper;



	/**
	 * 初始化权限配置
	 * 
	 * @author : xxx
	 * @date :2016年4月14日 下午1:52:46
	 */
	@PostConstruct
	@Override
	public void intiPermission() {
		LogTool.debug(getClass(), ">>>>>>更新shirot权限功能>>>>开始");
		Map<String, String > chains = new LinkedHashMap();
		chains.putAll(getPreDefualtPermission());
		chains.putAll(getXmlPermission());
		chains.putAll(getDbPermission());
		chains.putAll(getAfterDefualtPermission());
		initShiro(chains);
		LogTool.debug(getClass(), ">>>>>>更新shirot权限功能>>>完成");
	}

	/**
	 * 更新权限配置[线程安全]
	 * 
	 * @author : xxx
	 * @date :2016年4月14日 下午1:54:20
	 */
	public void initShiro(Map<String, String > chains) {
		synchronized (shiroFilterFactoryBean) {
			AbstractShiroFilter shiroFilter = null;
			try {
				shiroFilter = (AbstractShiroFilter) shiroFilterFactoryBean.getObject();
			} catch (Exception e) {
				LogTool.error(getClass(), e);
			}
			// 获取过滤管理器
			PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter
					.getFilterChainResolver();
			DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver.getFilterChainManager();

			// 清空初始权限配置
			manager.getFilterChains().clear();
			shiroFilterFactoryBean.getFilterChainDefinitionMap().clear();
			// 清空 PathMatchingFilter 中的 appliedPaths，或者会以追加的方式更新权限数据
			custRolesAuthorizationFilter.clearAppliedPaths();

			// 重新构建生成
			shiroFilterFactoryBean.setFilterChainDefinitions("");
			for (Map.Entry<String, String> entry : chains.entrySet()) {
				String url = entry.getKey();
				String chainDefinition = entry.getValue().trim().replace(" ", "");
				manager.createChain(url, chainDefinition);
			}
			shiroFilterFactoryBean.setFilterChainDefinitionMap(chains);
		}
	}



	/**
	 * 默认优先的权限配置
	 */
	public Map<String, String> getPreDefualtPermission() {
		Map<String, String> defaultPermission = new LinkedHashMap<>();
		// 配置不会被拦截的链接 顺序判断


		// <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
		// <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
		LogTool.debug(getClass(), ">>>>>>读取默认优先的权限配置成功");
		return defaultPermission;
	}

	/**
	 * 读取xml的权限配置
	 */
	public Map<String, String> getXmlPermission() {
		Ini ini = new Ini();
		ini.load(definitions); // 加载资源文件节点串
		Section section = ini.getSection("urls"); // 使用默认节点
		if (CollectionUtils.isEmpty(section)) {
			section = ini.getSection(Ini.DEFAULT_SECTION_NAME); // 如不存在默认节点切割,则使用空字符转换
		}
		if (CollectionUtils.isEmpty(section)) {
			return new LinkedHashMap<>();
		}
		LogTool.debug(getClass(), ">>>>>>读取xml的权限配置成功");
		return section;
	}

	/**
	 * 读取数据库的权限配置
	 */
	public Map<String, String> getDbPermission() {
		Map<String, String> permissionMap = new LinkedHashMap<>();

		List<RoleAuthCust> roleAuthCusts = MenuCustMapper.getAllMenuRole();
		if (roleAuthCusts == null || roleAuthCusts.size() <= 0) {
			return permissionMap;
		}

		Map<Long, Set<RoleAuthCust>> map = this.handleRoleAuthGroup(roleAuthCusts);
		for (Iterator<Map.Entry<Long, Set<RoleAuthCust>>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
			Map.Entry<Long, Set<RoleAuthCust>> entry = iter.next();

			Long roleId = entry.getKey();
			for (RoleAuthCust roleAuthCust : entry.getValue()) {
				if (StringUtils.isBlank(roleAuthCust.getMenuUrl()) ||
						Objects.equals("#", roleAuthCust.getMenuUrl())) {
					continue;
				}
				// 同一资源多个角色
				String roles = permissionMap.get(roleAuthCust.getMenuUrl());
				if (StringUtils.isBlank(roles)) {
					// 所有的url都赋予给admin角色
					roles = "roles[0,admin]";
				}
				// 删除 "]"
				roles = roles.substring(0, roles.length() - 1);
				roles += "," + roleId + "]";
				permissionMap.put(roleAuthCust.getMenuUrl(), roles);
				permissionMap.put(roleAuthCust.getMenuUrl(), roles);
			}
		}
		LogTool.debug(getClass(), ">>>>>>读取数据库的权限配置成功");
		return permissionMap;
/*

		//缓存处理---有必要吗 todo
		// 清除缓存数据
		LogTool.info(getClass(), ">>>>>>清空>>>权限数据redis缓存>>>>开始");
		Set<String> roleMenuKeys = jedisClient.keys(ShiroConstant.role_auth + "*");
		for (String key : roleMenuKeys) {
			jedisClient.del(key);
		}
		LogTool.info(getClass(), ">>>>>>清空>>>权限数据redis缓存>>>完成");
		// 角色-权限 放入redis
		LogTool.info(getClass(), ">>>>>>将角色权限数据存入redis中>>>开始");
		for (Iterator<Map.Entry<Long, Set<RoleAuthCust>>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
			Map.Entry<Long, Set<RoleAuthCust>> entry = iter.next();
			jedisClient.set(getRoleMenuRedisKey(entry.getKey()), entry.getValue());
		}
		LogTool.info(getClass(), ">>>>>>角色权限数据存入redis完成。对应redisKeyPrefix=" + ShiroConstant.role_auth);
		//从redis取角色-权限缓存
		LogTool.info(getClass(), ">>>>>>取>>>角色权限数据存入redis中>>>开始");
		Set<String> keys = jedisClient.keys(ShiroConstant.role_auth + "*");
		for (String key : keys) {
			// 获取角色ID
			String roleId = key.substring(key.lastIndexOf(":") + 1);
			// 角色对应权限资源
			List<RoleAuthCust> roleAuthCusts = jedisClient.getList(key, RoleAuthCust.class);
			// todo 后续操作
		}
		LogTool.info(getClass(), ">>>>>>取>>>角色权限数据存入redis中>>>完成");
*/
	}

	/**
	 * 默认后置的权限配置
	 * 一般/**(包含范围大的)放在这里
	 */
	public Map<String, String> getAfterDefualtPermission(){
		Map<String, String> defaultPermission = new LinkedHashMap<>();
		//defaultPermission.put("/**", "anon");
		LogTool.debug(getClass(), ">>>>>>读取默认后置的权限配置成功");
		return defaultPermission;
	}

	/**
	 * 角色-权限分组
	 */
	private Map<Long, Set<RoleAuthCust>> handleRoleAuthGroup(List<RoleAuthCust> roleAuthCustList) {
		if (roleAuthCustList == null || roleAuthCustList.size() <= 0) {
			return new HashMap<>();
		}
		//key=roleId,value=Set<RoleAuthCust>
		Map<Long, Set<RoleAuthCust>> map = new HashMap<>();
		for (RoleAuthCust roleMenuCust : roleAuthCustList) {
			Long roleId = roleMenuCust.getRoleId();
			Set<RoleAuthCust> menuSet = map.get(roleId);
			if (menuSet == null) {
				menuSet = new HashSet<>();
			}
			menuSet.add(roleMenuCust);
			map.put(roleId, menuSet);
		}
		return map;

	}

	private String getRoleMenuRedisKey(Long roleId) {
		return ShiroConstant.role_auth + roleId;
	}














	public String getDefinitions() {
		return definitions;
	}

	public void setDefinitions(String definitions) {
		this.definitions = definitions;
	}

	public CustRolesAuthorizationFilter getCustRolesAuthorizationFilter() {
		return custRolesAuthorizationFilter;
	}

	public void setCustRolesAuthorizationFilter(CustRolesAuthorizationFilter custRolesAuthorizationFilter) {
		this.custRolesAuthorizationFilter = custRolesAuthorizationFilter;
	}

}