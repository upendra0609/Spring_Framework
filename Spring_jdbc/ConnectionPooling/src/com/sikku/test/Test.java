package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.dao.EmployeeDao;
import com.sikku.dao.EmployeeDaoImpl;
import com.sikku.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		EmployeeDaoImpl dao = (EmployeeDaoImpl)context.getBean("employeeDao");
		
		Employee emp = new Employee();
		emp.setEno(100);
		emp.setEname("AAA");
		emp.setEsal(12000);
		emp.setEaddr("Pune");
		
		String add = dao.add(emp);
		System.out.println(add);

	}

}
