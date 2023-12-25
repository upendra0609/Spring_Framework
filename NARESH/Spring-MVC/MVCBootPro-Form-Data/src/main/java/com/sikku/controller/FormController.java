package com.sikku.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sikku.model.Student;

@Controller
//@RequestMapping("/form")
public class FormController {

	@GetMapping("/")
	public String home() {
		return "form";
	}

	@PostMapping("/submit")
	public String getForm(Map<String, Object> map, @ModelAttribute("stud") Student st) {
		map.put("student", st);
		return "report";
	}

}
