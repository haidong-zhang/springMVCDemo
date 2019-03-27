package com.haidong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class HelloController {
	
	@Value("${aa}")
	private String value;
	@Value("${bb}")
	private String value2;

	@RequestMapping(value="/say.mvc")
	public String say(Model model){
		System.out.println("-say-");
		model.addAttribute("msg","msg");
		return "/hello.jsp";
	}
	
	@RequestMapping(value="say1.mvc",method=RequestMethod.POST)
	public ModelAndView say1(){
		System.out.println("say1");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/hello.jsp");
		modelAndView.addObject("msg","ff");
		return modelAndView;
	}
	@RequestMapping(value="say2.mvc",method=RequestMethod.GET)
	public ModelAndView say2(){
		System.out.println(value);
		System.out.println(value2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/hello.jsp");
		modelAndView.addObject("msg","say2");
		return modelAndView;
	}
}
