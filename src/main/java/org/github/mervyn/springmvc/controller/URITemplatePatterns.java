package org.github.mervyn.springmvc.controller;



import org.github.mervyn.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * @ClassName: URITemplatePatterns
 * @Description: Controller,演示URITemplatePatterns使用方法
 * @author: Mervyn
 * @Time: 2015年11月30日 下午5:11:11
 */
@Controller
public class URITemplatePatterns {
	@RequestMapping(path="/addUser/{uriParameter}.do")
	public ModelAndView addUser(@PathVariable("uriParameter") String parameter){
		System.out.println("parameter:" + parameter);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("message", "uriTemplatePatterns");	
		return mav;
	}
}
