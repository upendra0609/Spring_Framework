package com.sikku.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ProcessingTimeInterceptor extends HandlerInterceptorAdapter {
//public class ProcessingTimeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		Long startTime= System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		System.out.println("PreHandler");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mav)
			throws Exception {
		Long endTime= System.currentTimeMillis();
		
		Long startTime = (Long)request.getAttribute("startTime");
		
		Long processingTime = endTime - startTime;
		mav.addObject("startTime",startTime);
		mav.addObject("endTime", endTime);
		mav.addObject("processingTime",processingTime);
		System.out.println("PostHandler");

	}


	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exc)
			throws Exception {
		
		System.out.println("After Completion\n");
	}
	
}
