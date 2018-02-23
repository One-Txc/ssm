package txc.xxy.ssm.shiro.ext.authc;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * 自定义凭据
 * 
 * @author xxx
 * @date 2016年4月14日 上午9:59:37
 * @version 1.0
 */
public class UserCredentialsMatcher extends SimpleCredentialsMatcher {

	/**
	 * 登录认证校验、只有return ture才表示登录成功 在 AuthorizingRealm.doGetAuthenticationInfo
	 * return之后执行
	 * 
	 * @author : xxx
	 * @date :2016年4月14日 上午11:15:23
	 */
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		return true;
	}

}
