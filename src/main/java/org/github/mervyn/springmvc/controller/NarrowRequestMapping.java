package org.github.mervyn.springmvc.controller;

import org.github.mervyn.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: NarrowRequestMapping
 * @Description: 处理器，演示请求映射窄化
 * @author: Mervyn
 * @Time: 2015年11月30日 上午9:16:43
 */
@Controller("narrowRequestMapping")
@RequestMapping(value="/narrowRequestMapping")	//①处理器的通用处理前缀
public class NarrowRequestMapping {
	
	@RequestMapping(value="/addUser.do")	//②相对于①处的映射进行的窄化
	public ModelAndView addUser(User user){
		System.out.println("用户名为：" + user.getUsername());
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", user.getUsername());
		return mav;
	}
}
