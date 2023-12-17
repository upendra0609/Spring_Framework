package com.sikku;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sikku.controller.PayrollOperationsController;
import com.sikku.model.Employee;

@SpringBootApplication
public class BootProj01LayeredAppApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj01LayeredAppApplication.class, args);
		PayrollOperationsController bean = context.getBean("payroll", PayrollOperationsController.class);
		List<Employee> showEmployeeByDesg = bean.showEmployeeByDesg("clerk", "manager", "salesman");
		showEmployeeByDesg.forEach(emp -> {
			System.out.println(emp);
		});

		System.out.println(showEmployeeByDesg.size());

		context.close();
	}

}
