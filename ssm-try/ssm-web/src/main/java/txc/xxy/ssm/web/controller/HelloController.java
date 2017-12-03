package txc.xxy.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by txc on 17-12-3.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/exception")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }
}
