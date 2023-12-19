package com.sikku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sikku.service.ActorManagementServiceImpl;

@SpringBootApplication
public class DataJpaCrudRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaCrudRepositoryApplication.class, args);
		ActorManagementServiceImpl serviceImpl = context.getBean("actorService", ActorManagementServiceImpl.class);
		
		
		/*
		 * try { List<Actor> list = serviceImpl.findAllActor(false, "aid");
		 * list.forEach(actor->System.out.println(actor)); } catch (DataAccessException
		 * e) { e.printStackTrace(); }
		 */

	}

}
