package com.sikku;

import java.util.List;

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
		
		
		/*
		 * try { List<Actor> list = serviceImpl.findAllActor(false, "aid");
		 * list.forEach(actor->System.out.println(actor)); } catch (DataAccessException
		 * e) { e.printStackTrace(); }
		 */

	}

}
