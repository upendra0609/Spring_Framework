package com.sikku;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.services.BankService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/sikku/cfgs/ApplicationContext.xml");

		BankService bank = context.getBean("bankService", BankService.class);
		Double interest = bank.calculateInterestAmount(1200.0, 12.0, 2.0);
		System.out.println(interest);
		context.close();
	}
}
