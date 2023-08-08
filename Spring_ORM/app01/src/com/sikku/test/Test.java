package com.sikku.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sikku.bean.Employee;

public class Test {

	public static void main(String[] args) throws Exception {

		Configuration config = new Configuration();

		config.configure("/com/sikku/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEno(555);
		emp.setEname("AAA");
		emp.setEaddr("Bhopal");
		emp.setEsal(8000);

		session.update(emp);
		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
