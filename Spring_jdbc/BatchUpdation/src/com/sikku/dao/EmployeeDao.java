package com.sikku.dao;

import java.util.List;

import com.sikku.dto.Employee;

public interface EmployeeDao {
	public int[] insert(List<Employee> empList); 
	public int[] update(); 
}
