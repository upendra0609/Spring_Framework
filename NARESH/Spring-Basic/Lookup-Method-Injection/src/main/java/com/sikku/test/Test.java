package com.sikku.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.beans.Cricketer;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sikku/cfgs/ApplicationContext.xml");
		Cricketer cricket = (Cricketer) context.getBean("cktr");  //Gets InMemory proxy class obj which is sub class of target class
		cricket.batting();
		context.close();
			
	}

}
