package com.sikku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.sikku.model.Employee;

@Repository("sqlEmpDAO")
@Profile({ "dev", "test" })
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESG = "SELECT EMPNO,ENAME,DESG,SAL,DEPTNO FROM EMPLOYEE WHERE DESG IN(?,?,?) ORDER BY DESG";

	@Autowired
	private DataSource ds;

	public MySQLEmployeeDAOImpl() {
		System.out.println("0 param constructor mysql-daoImpl");
	}

	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws SQLException {
		System.out.println(ds.getClass().getName()+"   sql");
		List<Employee> empList = null;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESG)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery();) {
				empList = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					empList.add(emp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return empList;
	}

}