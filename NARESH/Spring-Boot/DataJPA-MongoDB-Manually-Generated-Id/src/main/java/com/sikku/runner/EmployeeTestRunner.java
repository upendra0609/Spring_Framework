package com.sikku.runner;

import java.util.Random;
import java.util.UUID;

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

		/*
		 * try { Employee employee = new Employee(); employee.setEname("AAAA");
		 * employee.setEaddr("Pune"); employee.setEno(100);
		 * employee.setEsalary(120000.00); employee.setIsVaccinated(true);
		 * 
		 * Employee insert = repository.insert(employee);
		 * System.out.println("Employee is saved with id: " + insert.getId());
		 * 
		 * } catch (DataAccessException e) { e.printStackTrace(); }
		 */

		/*
		 * try {
		 * 
		 * List<Employee> list = repository.findAll();
		 * 
		 * list.forEach(System.out::println);
		 * 
		 * 
		 * } catch (DataAccessException e) { e.printStackTrace(); }
		 */

		try {
			Employee employee = new Employee();
			employee.setEno(new Random().nextInt(10000));
			employee.setEname("BBB");
			employee.setEaddr("Hyd");
			employee.setEsalary(220000.00);
			employee.setIsVaccinated(false);

			Employee insert = repository.insert(employee);
			System.out.println("Employee is saved with id: " + insert.getEno());

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}

}
