package com.n22.cs.comp.shiro.authorzationfilter;

import com.n22.cs.comp.shiro.CustRolesAuthorizationFilter;
import com.n22.cs.comp.shiro.ShiroConstant;
import org.apache.shiro.subject.Subject;
import txc.xyz.base.model.BaseRole;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: txc
 * @date: 18-2-23 下午5:07
 */
public class RoleTypeAuthorizationFilter extends CustRolesAuthorizationFilter {

    /**
     * 访问被允许时判断角色
     */
    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
            throws IOException {

        //获取该路径需要的权限（角色类型）
        final String[] roleTypeArray = (String[]) mappedValue;
        if (roleTypeArray == null || roleTypeArray.length == 0) {
            // no roles specified, so nothing to check - allow access.
            return true;
        }

        //获取用户有的权限
        final Subject subject = getSubject(request, response);
        List<BaseRole> roleList = (List<BaseRole>) subject.getSession().getAttribute(ShiroConstant.USER_ROLE);

        if (roleList == null || roleList.size() == 0) {
            return false;
        }

        //判断：或逻辑,满足其一就可
        for (String roleType : roleTypeArray) {
            for(BaseRole role : roleList){
                if(roleType.equals(role.getRoleType())){
                    return true;
                }
            }
        }
        return false;
    }


}
