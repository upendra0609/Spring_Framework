package com.sikku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.sikku.sbeans.Company;

@SpringBootApplication
@PropertySource("App.properties")
public class ConfigureProperties {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigureProperties.class, args);
		
		Company comp = context.getBean("comp",Company.class);
		System.out.println(comp);
		context.close();
	}

}
