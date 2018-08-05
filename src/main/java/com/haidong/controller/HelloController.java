package com.haidong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class HelloController {
	
	@RequestMapping(value="/say.mvc")
	public String say(Model model){
		System.out.println("-say-");
		//������ͼ
		model.addAttribute("msg","����");
		return "/hello.jsp";
	}
	
	@RequestMapping(value="say1.mvc",method=RequestMethod.POST)
	public ModelAndView say1(){
		System.out.println("say1");
		ModelAndView modelAndView = new ModelAndView();
		//������ͼasdfasdfasdf
		modelAndView.setViewName("/hello.jsp");
		modelAndView.addObject("msg","����");
		return modelAndView;
	}
}
