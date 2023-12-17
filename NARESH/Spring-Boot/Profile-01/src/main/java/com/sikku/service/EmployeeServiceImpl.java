package com.sikku.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.dao.IEmployeeDAO;
import com.sikku.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> FetchEmployeeByDEsgs(String desg1, String desg2, String desg3) throws SQLException {
		return empDAO.getEmployeeByDesgs(desg1, desg2, desg3);
	}

}
