package com.sikku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.dao.StudentDao;
import com.sikku.dto.Student;
import com.sikku.factory.StudentDaoFactory;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sikku/resources/ApplicationContext.xml");
		StudentDaoFactory studentDaoFactory =(StudentDaoFactory)context.getBean("studentFactory");
		StudentDao studentDao = studentDaoFactory.getStudentDao();
		
//		Student search = studentDao.search(100);
//		System.out.println(search);
		
		
//		Student std = new Student();
//		std.setSid(100);
//		std.setSname("AAA");
//		std.setSaddr("pune");
//		
//		String add = studentDao.add(std);
//		System.out.println(add);
		
//		Student std = new Student();
//		std.setSid(100);
//		std.setSname("BBB");
//		std.setSaddr("satna");
//		
//		String add = studentDao.update(std);
//		System.out.println(add);
		
		String delete = studentDao.delete(100);
		System.out.println(delete);
	}
}
