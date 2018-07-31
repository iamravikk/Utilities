package com.utilities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/")	
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}	

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld(@RequestParam("name") String name) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloworld");
		modelAndView.addObject("name", name);
		return modelAndView;
	}
}
