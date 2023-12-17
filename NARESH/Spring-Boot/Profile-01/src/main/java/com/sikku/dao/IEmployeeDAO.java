package com.sikku.dao;

import java.sql.SQLException;
import java.util.List;

import com.sikku.model.Employee;

public interface IEmployeeDAO {
	List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws SQLException;

}
