package com.sikku.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sikku.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate template;
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	@Override
	public int[] insert(List<Employee> empList) {
		int[] rowCount =null;
		try {
			String query = "insert into emp1 values(?,?,?,?)";
			 rowCount = template.batchUpdate(query, new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int index) throws SQLException {
					Employee emp = empList.get(index);
					ps.setInt(1, emp.getEno());
					ps.setString(2, emp.getEname());
					ps.setFloat(3, emp.getEsal());
					ps.setString(4,emp.getEaddr());
					
				}
				
				@Override
				public int getBatchSize() {
					
					return empList.size();
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}


	@Override
	public int[] update() {
		int[] rowCont = null;
		try {
			String Query1="insert into emp1 values(999,'ZZZ',909093,'zzzz')";
			String query2 = "update emp1 set ESAL= ESAL+500 where eno = 1";
			String query3 = "delete from emp1 where eno=2";
			rowCont = template.batchUpdate(Query1,query2,query3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCont;
	}

}
