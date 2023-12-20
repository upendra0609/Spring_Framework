package com.sikku.runner;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.dialect.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

@Component
public class CallingPL_SQLTestRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		Session session = manager.unwrap(Session.class);
		
		session.doWork(con->{
			CallableStatement cs = con.prepareCall("{?=CALL F_GET_ACTORS_DATA_BY_PHONES(?,?)}");
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			
			cs.setLong(2, 121212L);
			cs.setLong(3, 9876543210L);
			
			cs.execute();
			ResultSet rs =(ResultSet) cs.getObject(1);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
			}
			
		});
	}

}
