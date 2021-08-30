package com.jj.jejuTour.Tour.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/cms")
@Controller
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/getTourInfo", method = RequestMethod.GET)
	public String home(Model model) {

		
		String helloWorld = "helloWorld";
		
		model.addAttribute("serverTime", helloWorld );
		
		return "home";
	}
	
}
