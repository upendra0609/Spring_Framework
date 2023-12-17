package com.sikku;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sikku.controller.PayrollOperationsController;
import com.sikku.model.Employee;

@SpringBootApplication
public class ProfilesPropertiesfilesApplication {

	@Autowired
	private Environment env;

	@Bean("c3p0ds")
	@Profile("test")
	DataSource getDS() throws PropertyVetoException {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		ds.setUser(env.getProperty("spring.datasource.username"));
		ds.setPassword(env.getProperty("spring.datasource.password"));
		ds.setMinPoolSize(10);
		ds.setMaxConnectionAge(20);
		return ds;
	}

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(ProfilesPropertiesfilesApplication.class, args);
		PayrollOperationsController controller = context.getBean("payroll", PayrollOperationsController.class);
		List<Employee> list = controller.showEmployeeByDesg("alerk", "manager", "developer");

		for (Employee e : list) {
			System.out.println(e);
		}
		context.close();
	}

}
