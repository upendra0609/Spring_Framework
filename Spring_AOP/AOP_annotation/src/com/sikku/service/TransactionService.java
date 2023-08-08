package com.sikku.service;

import com.sikku.beans.Account;
import com.sikku.exception.InsufficientFundException;

public interface TransactionService {
	
	public String withhdraw(Account acc,int wd_amt) throws InsufficientFundException;

}
