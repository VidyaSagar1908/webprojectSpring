package com.sagar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sampleController {

	@RequestMapping("/sample")
	public ModelAndView sample(){
		
		ModelAndView model = new ModelAndView();
		
		return model.addObject("Message","hi spring");
	}
	
}
