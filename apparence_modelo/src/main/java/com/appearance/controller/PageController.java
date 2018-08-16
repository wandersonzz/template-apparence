package com.appearance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@GetMapping("/index")
	public ModelAndView pageHome() {
		ModelAndView mv = new ModelAndView("demot");
		
		return mv;
		
	}
}
