package com.sikku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sikku.command.Student;
import com.sikku.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcomeDef";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView ShowAddForm() {
		return new ModelAndView("addDef", "student", new Student());
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView ShowSearchForm() {
		return new ModelAndView("searchDef", "student", new Student());
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView ShowDeleteForm() {
		return new ModelAndView("deleteDef", "student", new Student());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(Student student) {
		String status = "";
		status = studentService.addStudent(student);
		return new ModelAndView("statusDef", "status", status);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(Student student) {
		ModelAndView modelAndView = null;
		Student student1 = studentService.searchStudent(student.getSid());
		if (student1 != null) {
			modelAndView = new ModelAndView("studentDetailsDef", "student", student1);
		} else {
			modelAndView = new ModelAndView("statusDef", "status", "Student not existed");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(Student student) {
		String status = "";
		status = studentService.deleteStudent(student.getSid());
		return new ModelAndView("statusDef", "status", status);
	}
}
