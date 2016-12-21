package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class mongoIndexController {

	@RequestMapping(value = "add" ,method = RequestMethod.GET)
	public String addData(Model model){
		
		return "";
	}
}
