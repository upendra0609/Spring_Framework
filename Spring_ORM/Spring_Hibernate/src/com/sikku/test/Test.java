package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.beans.Employee;
import com.sikku.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");
		
		Employee emp = new Employee();
		emp.setEno(100);
		emp.setEname("BBB");
		emp.setEsal(999);
		emp.setEaddr("satna");
		
		dao.delete(emp);
		
//		Employee search = dao.search(100);
//		System.out.println(search.getEname());
		
		
		
		

	}

}
