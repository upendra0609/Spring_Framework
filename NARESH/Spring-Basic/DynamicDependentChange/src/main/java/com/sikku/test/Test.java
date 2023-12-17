package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.beans.Flipkart;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sikku/cfgs/ApplicationContext.xml");
		Flipkart fpkt = context.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.getCourier().getClass().getName());
			
	}

}
