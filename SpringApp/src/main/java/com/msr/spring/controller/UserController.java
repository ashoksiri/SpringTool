package com.msr.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.msr.spring.dto.User;
import com.msr.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	public UserService service;
	
	@RequestMapping(value="/list")
    public ModelAndView list() {
        List<User> itemList = service.findAllUsers();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("itemList", itemList);
        return model;
    }

	@RequestMapping(value = "static/dologin",method = RequestMethod.POST)
	public String dologin(@ModelAttribute User user){
		
		User user1 = service.findBySsn(user.getUsername());
		if (user1 != null) {
			if (user1.getPassword().equals(user.getPassword())) {
				return "redirect:/static/hello.html";
			} else {
				return "redirect:/static/login.html";
			}
		}
		else
			return "redirect:/static/login.html";
	}
  
  @RequestMapping(value = "static/register",method = RequestMethod.POST)
  public String register(@ModelAttribute User user)
  {
	  service.saveUser(user);
	return "redirect:/static/login.html";  
  }
}
