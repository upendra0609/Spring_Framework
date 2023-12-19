package com.sikku.services;

public interface IBankService {
	public String transferMoney(Long srcAcno, Long destAcno, double amount);

}
