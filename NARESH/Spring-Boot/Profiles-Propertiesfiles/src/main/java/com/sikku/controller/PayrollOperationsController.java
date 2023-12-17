package com.sikku.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sikku.model.Employee;
import com.sikku.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationsController {

	@Autowired
	private IEmployeeService empService;

	public PayrollOperationsController() {
		System.out.println("0 param constructor service");
	}

	public List<Employee> showEmployeeByDesg(String desg1, String desg2, String desg3) throws SQLException {
		return empService.FetchEmployeeByDEsgs(desg1, desg2, desg3);
	}

}
