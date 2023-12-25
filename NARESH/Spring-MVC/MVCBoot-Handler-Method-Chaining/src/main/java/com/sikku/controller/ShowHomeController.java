package com.sikku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	@RequestMapping("/home")
	public String source() {
		System.out.println("Source");
		return "forward:dest";
	}

	@RequestMapping("/dest")
	public String destination() {
		System.out.println("Destination");
		return "welcome";
	}
}
