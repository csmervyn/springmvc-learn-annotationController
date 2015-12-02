package org.github.mervyn.springmvc.controller;

import org.github.mervyn.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("HelloWorldController")
//@RequestMapping(value="/springMVCSpringHibernate-template")
//implements Controller
public class HelloWorldController {
	
	
	@RequestMapping(value="/addUser.do")
	public ModelAndView addUser(User user) { 
		//1.收集参数、验证参�?
		//2.绑定参数到命令行对象
		//User user = new User();
		//user.setUsername(request.getParameter("userName").trim());
		//3.将命令对象传入业务层进行逻辑处理
		System.out.println("用户名："+user.getUsername());
		//4.选择下一个页�?
		ModelAndView mav = new ModelAndView();
		//添加数据模型
		mav.addObject("message", user.getUsername());
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页�?
		mav.setViewName("index");  
	    return mav;  
	}

	

}
