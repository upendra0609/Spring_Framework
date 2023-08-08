package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.beans.Employee;
import com.sikku.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		EmployeeService service = (EmployeeService) context.getBean("proxy");
		
		service.displayEmployeeDetail(emp);
		System.out.println("-------------");
		service.displayEmployeeDetail(emp);

	}

}
