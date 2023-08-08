package com.sikku.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("wish","name",request.getParameter("uname"));
		return mav;
	}

}
