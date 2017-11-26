/**
 * @Title: UserController.java
 * @Package txc.xxy.ssm.web.controller
 * @author Txc
 * @date 2017年4月27日 下午2:14:26
 */

package txc.xxy.ssm.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.n22.cs.comp.redis.JedisClient;

import txc.xxy.ssm.biz.UserBiz;

/**
  *
  * @ClassName: UserController
  * @author Txc
  * @date 2017年4月27日 下午2:14:26
  */
@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	UserBiz userBiz;
	@Resource
	private JedisClient jedisClient;
	
	

	
	/**
	 * 测试
	 * @Title: test
	 * @author Txc
	 */
	@RequestMapping("test.htm")
	public String test(HttpServletRequest request) throws Exception {
		jedisClient.set("name", "txc");
		System.out.println(jedisClient.get("name"));
		userBiz.test();
		request.getSession();
		return "test/test";
	}
}
