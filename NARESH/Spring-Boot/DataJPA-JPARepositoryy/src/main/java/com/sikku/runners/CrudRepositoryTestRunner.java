package com.sikku.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entity.Actor;
import com.sikku.service.ActorManagementServiceImpl;

@Component
public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private ActorManagementServiceImpl serviceImpl;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * try { List<Actor> list = serviceImpl.findAllActor(false, "aid");
		 * list.forEach(actor->System.out.println(actor)); } catch (DataAccessException
		 * e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { List<Integer> ids = Arrays.asList(1,2,3,4);
		 * serviceImpl.deleteById(ids); } catch (DataAccessException e) {
		 * e.printStackTrace(); }
		 */
		
		try {			
			List<Actor> list = serviceImpl.findByActorName("AAA");
			System.out.println(list);
		} catch (DataAccessException e) {
			// TODO: handle exception
		}


	}

}
