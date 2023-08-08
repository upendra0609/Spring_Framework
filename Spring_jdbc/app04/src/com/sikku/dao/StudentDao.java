package com.sikku.dao;

import com.sikku.dto.Student;

public interface StudentDao {
	public String add(Student std);
	public Student search(int sid);
	public String update(Student std);
	public String delete(int sid);

}
