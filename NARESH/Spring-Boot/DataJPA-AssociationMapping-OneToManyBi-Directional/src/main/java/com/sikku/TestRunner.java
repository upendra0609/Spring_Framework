package com.sikku;

import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;

public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		try {
			
			
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}

}
