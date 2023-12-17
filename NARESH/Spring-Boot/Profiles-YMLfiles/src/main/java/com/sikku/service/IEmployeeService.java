package com.sikku.service;

import java.sql.SQLException;
import java.util.List;

import com.sikku.model.Employee;

public interface IEmployeeService {

	List<Employee> FetchEmployeeByDEsgs(String desg1, String desg2, String desg3) throws SQLException;

}
