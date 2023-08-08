package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.dao.EmployeeDao;
import com.sikku.dto.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao)context.getBean("employeeDao");
		
		Employee employee = new Employee();
		employee.setEno(200);
		employee.setEname("ddd");
		employee.setEsal(6000);
		employee.setEaddr("bhopal");
		
//		String add = dao.add(employee);
//		
//		System.out.println(add);
		
		
//		Employee search = dao.search(200);
//		System.out.println(search);
		
//		String update = dao.update(employee);
//		System.out.println(update);
		
		String delete = dao.delete(200);
		System.out.println(delete);
		
	}

}
