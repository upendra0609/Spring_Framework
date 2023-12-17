package com.sikku.services;

public class BankService {

	public Double calculateInterestAmount(Double pamt, Double rate, Double time) {
		System.out.println("BankService calculateAmount()");
		return (pamt * Math.pow((1 + rate / 100), time)) - pamt;
	}

}
