package com.sikku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sikku.command.Student;
import com.sikku.exception.StudentMarksOutOfBoundException;

@Controller
public class StudentController {

	@RequestMapping(value = "/reg",method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("student_form","student",new Student());
	}
	
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	public ModelAndView registration(Student student ,ModelMap model) {
		if(student.getSmarks()<0 || student.getSmarks()>100) {
			throw new StudentMarksOutOfBoundException("Invalid Student Marks, please provide Student Marks between 0 to 100");
		}
		return new ModelAndView("studentdetail","student", student);
	}
}
