package com.sikku.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sikku.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee = new Employee();
		
		employee.setEno(rs.getInt("ENO"));
		employee.setEname(rs.getString("ENAME"));
		employee.setEsal(rs.getFloat("ESAL"));
		employee.setEaddr(rs.getString("EADDR"));
		
		return employee;
	}

}
