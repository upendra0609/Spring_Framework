package com.sikku.cgfs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sikku") // alternate to <context:component-scan> tag
public class AppConfig {

	@Bean("ldt")
	public LocalDateTime getDate() {
		System.out.println("date generate");
		return LocalDateTime.now();
	}

}
