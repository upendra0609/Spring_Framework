package com.sikku.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.documents.Employee;
import com.sikku.repository.IEmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeRepository repository;

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("start");
			List<Employee> list = repository.findByEsalaryBetween(100000.0, 4000000.0);

			list.forEach(System.out::println);
		} catch (DataAccessException e) {
			System.out.println("e");
			e.printStackTrace();
		}

	}

}
