package org.github.mervyn.springmvc.controller;

import org.github.mervyn.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
 * @ClassName: BindingRequestParameters
 * @Description: Controller,演示绑定参数
 * @author: Mervyn
 * @Time: 2015年11月30日 下午8:58:31
 */
@Controller
public class BindingRequestParameters {
	
	/**
	 * @Title: bindingRequestParameters
	 * @Description: 演示@RequestParam,它有3个参数，value:表示参数的名字。require:表示是否是必须的，默认是true。
	 * 				 defaultValue：表示默认值
	 * @param: @param username
	 * @param: @return
	 * @return: ModelAndView
	 * @throws:
	 */
	@RequestMapping(path="/bindRequestParameters.do")
	public ModelAndView bindingRequestParameters(@RequestParam(value="username",required=false,defaultValue="mervyn") String username){
		System.out.println("username is :" + username);
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("message", "bindRequestParameters");
		return mav;
	}
	
	/*
	 * @ModelAttribute 既可以用在方法上（一般用在非功能方法上），也可以用在方法参数上。用在非功能方法上时，一个Controller中的所有标注@ModelAttribute会先执行，然后才会
	 * 执行请求的相应@RequestMapping方法。
	 * @ModelAttribute一个具有如下三个作用：

		①绑定请求参数到命令对象：放在功能处理方法的入参上时，用于将多个请求参数绑定到一个命令对象，从而简化绑定流程，而且自动暴露为模型数据用于视图页面展示时使用；
		
		②暴露表单引用对象为模型数据：放在处理器的一般方法（非功能处理方法）上时，是为表单准备要展示的表单引用对象，如注册时需要选择的所在城市等，而且在执行功能处理方法（@RequestMapping注解的方法）之前，
		自动添加到模型对象中，用于视图页面展示时使用；
		
		③暴露@RequestMapping方法返回值为模型数据：放在功能处理方法的返回值上时，是暴露功能处理方法的返回值为模型数据，用于视图页面展示时使用。
	 * */
	
	/**
	 * @Title: returnUser
	 * @Description: "@ModelAttribute"用在方法（非功能处理方法）上，该Controller的所有方法在调用前，
	 * 					先执行此@ModelAttribute方法。
	 * 				 此方法中，model中的默认名字，根据函数返回值类型
	 * @param: @param user
	 * @param: @return
	 * @return: User
	 * @throws:
	 */
	@ModelAttribute
	public User returnUser(User user){
		user.setUsername("mervyn");
		System.out.println(user.getUsername());
		return user;
	}
	
	
}
