package com.sikku.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sikku.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	// for method reference
	private static Employee getEmp(ResultSet rs, int index) {
		Employee employee = new Employee();
		try {
			employee.setEno(rs.getInt("ENO"));
			employee.setEname(rs.getString("ENAME"));
			employee.setEsal(rs.getFloat("ESAL"));
			employee.setEaddr(rs.getString("EADDR"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String add(Employee emp) {
		String status = "";

		try {
//			List<Employee> emp1 = jdbcTemplate.query("select * from emp1 where ENO =" + emp.getEno(),
//					new EmployeeRowMapper());

			List<Employee> emp1 = jdbcTemplate.query("select * from emp1 where ENO =" + emp.getEno(),
					EmployeeDaoImpl::getEmp);

			if (emp1.isEmpty()) {
				int rowCount = jdbcTemplate.update("insert into emp1 values(" + emp.getEno() + ",'" + emp.getEname()
						+ "'," + emp.getEsal() + ",'" + emp.getEaddr() + "')");
				if (rowCount == 1) {
					status = "employee inserted successfully";
				} else {
					status = "employee insertion failure";
				}
			} else {
				status = "employee already existed";
			}

		} catch (Exception e) {
			status = "employee insertion failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public Employee search(int eno) {
		List<Employee> list = jdbcTemplate.query("select * from emp1 where ENO=" + eno, EmployeeDaoImpl::getEmp);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public String update(Employee emp) {
		String status = "";
		
		Employee search = search(emp.getEno());

		if (search==null) {
			status = "no data found with Eno " + emp.getEno();
		} else {
			int rowCount = jdbcTemplate.update("update emp1 set ENAME='" + emp.getEname()
					+ "' , ESAL=" + emp.getEsal() + ", EADDR='" + emp.getEaddr() + "'  where ENO=" + emp.getEno());
			if (rowCount == 1) {
				status = "updated";
			} else {
				status = "updation failed";
			}
		}
		return status;
	}

	@Override
	public String delete(int eno) {
     String status = "";
		
		Employee search = search(eno);
		if(search==null) {
			status = "no data found with Eno " + eno;
		}else {
			int update = jdbcTemplate.update("delete from emp1 where ENO="+eno);
			if(update ==1) {
				status = "data deleted";
			}else {
				status = "data not deleted";
			}
		}
		return status;
	}

}
