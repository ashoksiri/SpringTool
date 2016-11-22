package com.msr.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="hello")
	public String welcome(){
		
		return "redirect:/static/hello.html";
	}
	
	@RequestMapping(value="login" ,method= RequestMethod.GET)
	public String login(){
		return "redirect:/static/login.html";
	}
}
