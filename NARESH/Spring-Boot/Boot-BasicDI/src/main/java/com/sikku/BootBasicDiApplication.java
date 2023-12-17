package com.sikku;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sikku.beans.WishMessageGenerator;

@SpringBootApplication
public class BootBasicDiApplication {

	@Bean("dt")
	LocalDateTime name() {
		System.out.println("date injected");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootBasicDiApplication.class, args);
		WishMessageGenerator bean = context.getBean("msg",WishMessageGenerator.class);
		System.out.println(bean.getMessage("Ram"));
		context.close();
	}

}
