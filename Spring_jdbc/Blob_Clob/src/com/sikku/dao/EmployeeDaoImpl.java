package com.sikku.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.util.FileCopyUtils;

import com.sikku.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	private LobHandler lobHandler;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public LobHandler getLobHandler() {
		return lobHandler;
	}

	public void setLobHandler(LobHandler lobHandler) {
		this.lobHandler = lobHandler;
	}

	@Override
	public void insertEmployee(Employee emp) {

		String query = "insert into emp20 values(?,?,?,?)";
		jdbcTemplate.execute(query, new AbstractLobCreatingPreparedStatementCallback(lobHandler) {

			@Override
			protected void setValues(PreparedStatement ps, LobCreator lobcreater) throws SQLException, DataAccessException {
				
				try {
					ps.setInt(1, emp.getEno());
					ps.setString(2, emp.getEname());
					
					FileInputStream fis = new FileInputStream(emp.getImage());
					FileReader fir = new FileReader(emp.getResume());
					lobcreater.setBlobAsBinaryStream(ps, 3, fis, (int)emp.getImage().length());
					lobcreater.setClobAsCharacterStream(ps, 4, fir, (int)emp.getResume().length());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}

	@Override
	public Employee readEmployee(int eno) {
		Employee emp = new Employee();

		String query = "select * from emp20 where eno ="+eno;
		
		jdbcTemplate.query(query, new AbstractLobStreamingResultSetExtractor<Object>() {

			@Override
			protected void streamData(ResultSet rs) throws SQLException, IOException, DataAccessException {
				emp.setEno(rs.getInt("ENO"));
				emp.setEname(rs.getString("ENAME"));
				
				File file1 = new File("C:\\Users\\upendra singh\\Desktop\\a.jpg");
				FileOutputStream fos = new FileOutputStream(file1);
				FileCopyUtils.copy(lobHandler.getBlobAsBinaryStream(rs, 3), fos);
				emp.setImage(file1);
				
				File file2 = new File("C:\\Users\\upendra singh\\Desktop\\a.txt");
				FileWriter fw = new FileWriter(file2);
				FileCopyUtils.copy(lobHandler.getClobAsCharacterStream(rs, 4), fw);
				emp.setResume(file2); 	
			}
		});
		return emp;
	}

}
