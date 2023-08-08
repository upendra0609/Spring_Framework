package com.sikku.Test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.dao.EmployeeDaoImpl;
import com.sikku.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		EmployeeDaoImpl dao = (EmployeeDaoImpl) context.getBean("employeeDao");
		
//		Employee e1 = new Employee();
//		e1.setEno(1);
//		e1.setEname("AAA");
//		e1.setEsal(1000);
//		e1.setEaddr("aaa");
//		
//		Employee e2 = new Employee();
//		e2.setEno(2);
//		e2.setEname("BBB");
//		e2.setEsal(2000);
//		e2.setEaddr("bbb");
//		
//		Employee e3 = new Employee();
//		e3.setEno(3);
//		e3.setEname("CCC");
//		e3.setEsal(3000);
//		e3.setEaddr("ccc");
//		
//		List<Employee> list = new ArrayList<Employee>();
//		
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		
//		int[] rowCount = dao.insert(list);
//		
//		for(int i: rowCount) {
//			System.out.println(i);
//		}
		
		
		
		int[] rowCount = dao.update();
		
		for(int i: rowCount) {
			System.out.println(i);
		}
		
		

	}

}
