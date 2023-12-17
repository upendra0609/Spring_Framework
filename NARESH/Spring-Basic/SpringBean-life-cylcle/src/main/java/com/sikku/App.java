package com.sikku;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.beans.VoteEligibilityCheckingService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sikku/cfgs/ApplicationContext.xml");
		// Get message from property file according to the locale we submit

		VoteEligibilityCheckingService bean = context.getBean("votiong", VoteEligibilityCheckingService.class);
		System.out.println(bean.checkingVotingElligibility());
		context.close();
	}
}
