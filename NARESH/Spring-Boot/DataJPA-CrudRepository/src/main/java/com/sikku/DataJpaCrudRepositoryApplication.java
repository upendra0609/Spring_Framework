package com.sikku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.sikku.entity.Actor;
import com.sikku.service.ActorManagementServiceImpl;

@SpringBootApplication
public class DataJpaCrudRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaCrudRepositoryApplication.class, args);
		ActorManagementServiceImpl serviceImpl = context.getBean("actorService", ActorManagementServiceImpl.class);

		try {
			Actor actor = new Actor();
			actor.setAname("BBB");
			actor.setCaategory("bollywood");
			actor.setMobileNo(987456890L);
			String register = serviceImpl.register(actor);
			System.out.println(register);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		context.close();

	}

}
