package com.sikku.runner;

import java.util.Optional;

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
			/*
			 * int countEmp = repository.countEmp(); System.out.println(countEmp);
			 */
			
			Optional<Employee> emp = repository.getEmpByNameStartWith("B");
			
			emp.ifPresentOrElse(System.out::println,() -> System.out.println("Empty"));
		} catch (DataAccessException e) {
			System.out.println("e");
			e.printStackTrace();
		}

	}

}
