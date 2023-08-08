package com.sikku;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("message")
@Controller
public class HelloController {

	@RequestMapping("/hellopage")
	public String getHelloPage() {
		return "helloform";
	}
	
	@RequestMapping("/login")
	public String sayHello(@RequestParam("uname") String uname, ModelMap map) {
		map.addAttribute("message","Hello "+uname+"!");
		return "wish";
	}
}
