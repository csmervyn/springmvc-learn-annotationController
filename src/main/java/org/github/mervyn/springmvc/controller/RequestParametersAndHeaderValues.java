package org.github.mervyn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: RequestParameters
 * @Description: Controller,演示请求指定参数名称
 * @author: Mervyn
 * @Time: 2015年11月30日 下午8:04:50
 */
@Controller
public class RequestParametersAndHeaderValues {
	
	/**
	 * @Title: requestParameters
	 * @Description: 演示请求参数中必须要有create参数名，请求才被允许
	 * @param: @return
	 * @return: ModelAndView
	 * @throws:
	 */
	@RequestMapping(path="/requestParameters.do",params="create")
	public ModelAndView requestParameters(){
		System.out.println("RequestParameters success");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("message", "RequestParameters success");
		return mav;
	}
	
	/**
	 * @Title: requestParametersNoParameter
	 * @Description: 演示请求参数中必须没有create参数名，请求才被允许
	 * @param: @return
	 * @return: ModelAndView
	 * @throws:
	 */
	@RequestMapping(path="requestParametersNoParameter.do",params="!create")
	public ModelAndView requestParametersNoParameter(){
		System.out.println("RequestParameters success");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("message", "RequestParameters success");
		return mav;
	}
	
	/**
	 * @Title: headerValues
	 * @Description: 演示请求参数中必须有create=123参数名和值，请求才被允许
	 * @param: @return
	 * @return: ModelAndView
	 * @throws:
	 */
	@RequestMapping(path="/headerValues.do",params="create=123")
	public ModelAndView headerValues(){
		System.out.println("RequestParameters success");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("message", "RequestParameters success");
		return mav;
	}
}
