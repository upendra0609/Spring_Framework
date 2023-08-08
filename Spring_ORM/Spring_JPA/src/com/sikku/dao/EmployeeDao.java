package com.sikku.dao;

import com.sikku.entity.Employee;

public interface EmployeeDao {
	public String insertEmployee(Employee emp);
	public String updateEmployee(Employee emp);
	public Employee findEmployee(int eno);
	public String deleteEmployee(int eno);

}
