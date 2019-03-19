package com.haidong.controller;

import com.haidong.vo.in.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping("/user")
public class HelloController {
	
	/*@RequestMapping(value="/say.mvc")
	public String say(Model model){
		System.out.println("-say-");
		//返回视图
		model.addAttribute("msg","张三");
		return "/hello.jsp";
	}*/
	
	@RequestMapping(value="say1.mvc",method=RequestMethod.POST)
	public ModelAndView say1(){
		System.out.println("say1");
		ModelAndView modelAndView = new ModelAndView();
		//返回视图
		modelAndView.setViewName("/hello.jsp");
		modelAndView.addObject("msg","李四");
		return modelAndView;
	}

	@RequestMapping(value = "validate", method = RequestMethod.POST)
	@ResponseBody
	public String validate(@RequestBody @Valid Person p, BindingResult result) {
		System.out.println(result.hasErrors());
		System.out.println(p);
		return "success!";
	}
}
