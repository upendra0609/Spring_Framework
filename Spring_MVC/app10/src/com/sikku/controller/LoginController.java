package com.sikku.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		ModelAndView mav = null;
		
		if(uname.equals("sikku") && upwd.equals("sikku")) {
			mav = new ModelAndView("success");
		}else {
			mav = new ModelAndView("failure");
		}
		return mav;
	}

}
