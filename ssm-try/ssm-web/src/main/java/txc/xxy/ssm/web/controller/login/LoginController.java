package txc.xxy.ssm.web.controller.login;

import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import com.n22.cs.comp.common.MobileBrowerUtil;
import com.n22.cs.comp.common.enums.EnvEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.n22.cs.comp.common.IPUtil;

import txc.xxy.ssm.shiro.ext.SessionUtil;
import txc.xxy.ssm.shiro.ext.token.impl.LoginVO;

/**
 * @desc 登录处理器
 * @date 2016年12月6日 下午7:44:58
 */
@Controller
public class LoginController {

	@RequestMapping("login.ajax")
	public String doLogin(HttpServletRequest request, LoginVO loginBO, Map<String,Object> model) throws Exception {
		// 获取客户端ip
		String loginIp = IPUtil.getRemortIP(request);
		loginBO.setLoginIp(loginIp);
		Subject subject = SecurityUtils.getSubject();
		// 执行认证操作.
		try{
		subject.login(loginBO);
		}catch (Exception e) {
			model.put("err", e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return "redirect:r/login.htm";
		}
		return "redirect:r/index.htm";
	}

}
