package com.sikku.service;

import com.sikku.beans.Account;
import com.sikku.exception.InsufficientFundException;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public String withhdraw(Account acc, int wd_amt) throws InsufficientFundException {
		String status = "";
		if(acc.getBalance()>wd_amt) {
			int total_bal = acc.getBalance() - wd_amt;
			acc.setBalance(total_bal);
			System.out.println("from withdraw() : Transaction withdraw completed");
			status = "Success";
		}else {
			status = "FAILURE";
			throw new InsufficientFundException("fund are not sufficient in your account");
		}
		
		return status;
	}

}
