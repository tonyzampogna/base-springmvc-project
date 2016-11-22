package com.tonyzampogna.spring.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("*")
public class HomeController {
	
	@RequestMapping("/home1")
	public ModelAndView getHome1() {
		ModelAndView model = new ModelAndView("home1");
		model.addObject("time1", new Date());
		model.addObject("message1", "hello");
		return model;
	}

	@RequestMapping("/home2")
	public String getHome2(Map<String, Object> model) {
		model.put("time2", new Date());
		model.put("message2", "hello");
		return "home2";
	}
}
