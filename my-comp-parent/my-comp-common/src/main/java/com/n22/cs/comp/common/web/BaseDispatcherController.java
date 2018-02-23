package com.n22.cs.comp.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.n22.cs.comp.common.DispatcherUtils;

/**
 * @desc 用来转发请求到页面
 * @author xxx
 * @date 2016年11月23日 下午7:34:12
 */
public class BaseDispatcherController {

	/**
	 * 访问路径为 r/home/index.htm 的 则直接跳转至 jsp/home/index.vm中
	 */
	@RequestMapping(value = { "r/**/*.htm" })
	public String dispacher(HttpServletRequest request, HttpServletResponse response, Model model) {
		return DispatcherUtils.dispatcher(request, response, model);
	}

	/**
	 * 
	 * @desc: restful 请求风格,多个参数传递格式为 rest/detail/123-fdasf-3434.htm
	 * @remake : model中保存数据的key为param1,param2等
	 * @auth:xxx
	 * @date:2016年10月28日 上午11:29:53
	 * @param param
	 * @return
	 *
	 */
	@RequestMapping(value = "rest/**/{param}.htm", method = RequestMethod.GET)
	public String dispacher(@PathVariable("param") String param, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		// 多个参数
		String[] params = param.split("-");
		int index = 1;
		for (String p : params) {
			model.addAttribute("param" + (index++), p);
		}
		return DispatcherUtils.restfulDispatcher(request, response, model);
	}

}
