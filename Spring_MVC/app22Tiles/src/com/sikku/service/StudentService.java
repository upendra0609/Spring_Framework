package com.sikku.service;

import com.sikku.command.Student;

public interface StudentService {

	public String addStudent(Student student);
	public Student searchStudent(String sid);
	public String deleteStudent(String sid);
}
