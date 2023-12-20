package com.sikku;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class Dao {	

	@Autowired	
	private DataSource ds;

}
