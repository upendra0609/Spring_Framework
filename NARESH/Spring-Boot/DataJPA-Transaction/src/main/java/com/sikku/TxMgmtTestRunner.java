package com.sikku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.services.BankServiceImpl;

@Component
public class TxMgmtTestRunner implements CommandLineRunner {
	@Autowired
	private BankServiceImpl serviceImpl;

	@Override
	public void run(String... args) throws Exception {
		try {
			String msg = serviceImpl.transferMoney(100L, 102L, 8000.0);
			System.out.println(msg);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
