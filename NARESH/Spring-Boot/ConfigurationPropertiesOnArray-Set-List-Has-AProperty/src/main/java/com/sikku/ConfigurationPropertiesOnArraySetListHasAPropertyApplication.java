package com.sikku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sikku.beans.Employee;

@SpringBootApplication
public class ConfigurationPropertiesOnArraySetListHasAPropertyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigurationPropertiesOnArraySetListHasAPropertyApplication.class, args);
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
		context.close();
	}

}
