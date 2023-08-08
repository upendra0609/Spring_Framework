package com.sikku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sikku.command.User;

@Controller
public class I18NController {

	@RequestMapping(value="/reg", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("registrationform","user",new User());
	}
	
	@RequestMapping(value="/reg", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		return new ModelAndView("registrationdetail", "user",user);
	}
}
