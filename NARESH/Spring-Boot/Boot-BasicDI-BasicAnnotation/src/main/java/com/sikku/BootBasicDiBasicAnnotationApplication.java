package com.sikku;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sikku.beans.Vehicle;

@SpringBootApplication
@ImportResource("com/sikku/cfgs/ApplicationContext.xml")
public class BootBasicDiBasicAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootBasicDiBasicAnnotationApplication.class,
				args);

		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		vehicle.ride("satna", "pune");
		

		context.close();
	}

}
