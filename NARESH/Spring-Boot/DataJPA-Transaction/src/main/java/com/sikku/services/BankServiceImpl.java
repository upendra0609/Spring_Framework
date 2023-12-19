package com.sikku.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.repositories.IAccountRepository;

import jakarta.transaction.Transactional;

@Service("bankService")
public class BankServiceImpl implements IBankService {

	@Autowired
	private IAccountRepository repository;

	@Transactional
	@Override
	public String transferMoney(Long srcAcno, Long destAcno, double amount) {
		int withdrawMoney = repository.withdrawMoney(srcAcno, amount);
		int depositeMoney = repository.depositeMoney(destAcno, amount);
		if (withdrawMoney == 0 || depositeMoney == 0) {
			throw new RuntimeException("Problem in transfer money"); // must be unchecked exception
		}
		return "Money transfered from " + srcAcno + " to " + destAcno + ", amount: " + amount;

	}

}
