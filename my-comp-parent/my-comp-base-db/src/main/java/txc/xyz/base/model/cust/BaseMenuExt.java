package txc.xyz.base.model.cust;

import txc.xyz.base.model.BaseMenu;

import java.util.List;

/**
 * @desc 展示菜单列表时使用
 * @author xxx
 * @date 2016年12月15日 下午3:00:32
 */
@SuppressWarnings("serial")
public class BaseMenuExt extends BaseMenu {

	private List<BaseMenuExt> menuList;

	// 新增或修改时传递的参数
	private String menuContainUrls;// 包含url

	// 用于显示选中角色拥有的权限数据
	private boolean checked;

	public List<BaseMenuExt> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<BaseMenuExt> menuList) {
		this.menuList = menuList;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getMenuContainUrls() {
		return menuContainUrls;
	}

	public void setMenuContainUrls(String menuContainUrls) {
		this.menuContainUrls = menuContainUrls;
	}

}
