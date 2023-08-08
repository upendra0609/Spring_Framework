package com.sikku.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		return "helloform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView wish(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		return new ModelAndView("wish","name", name);
	}
	
}
