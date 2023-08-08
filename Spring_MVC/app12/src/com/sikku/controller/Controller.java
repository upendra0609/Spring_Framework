package com.sikku.controller;



import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("status")
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginform";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestAttribute("uname") String uname,@RequestAttribute("upwd") String upwd,ModelMap map) throws Exception {
		if(uname.equals("sikku") && upwd.equals("sikku")) {
			map.addAttribute("status", "Login Success");
		}else {
			map.addAttribute("status", "Login Failure");
		}
		return "status";
	}

}
