package com.sikku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sikku.bo.CustomerBO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository("oraDAO")
public class OracleCustomerDAOImpl implements ICustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUST_NO_SEQ.NEXTVAL,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public int insert(CustomerBO custBO) throws Exception {
		int count = 0;

		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);) {
			// set value
			if (ps != null) {
				ps.setString(1, custBO.getCname());
				ps.setString(2, custBO.getCadd());
				ps.setDouble(3, custBO.getPamt());
				ps.setDouble(4, custBO.getIntramt());
				count = ps.executeUpdate();
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
