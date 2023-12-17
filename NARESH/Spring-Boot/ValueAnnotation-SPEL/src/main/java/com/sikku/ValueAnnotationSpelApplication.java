package com.sikku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sikku.sbeans.Hotel;

@SpringBootApplication
public class ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ValueAnnotationSpelApplication.class, args);
		
		Hotel hotel = context.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		context.close();
	}

}
