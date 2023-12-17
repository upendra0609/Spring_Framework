package com.sikku.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataAccessException;

import com.sikku.entity.Actor;
import com.sikku.service.ActorManagementServiceImpl;

public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private ActorManagementServiceImpl serviceImpl;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			List<Actor> list = List.of((new Actor("BBB", "bbb", 789738197L)), (new Actor("CCC", "ccc", 7234738197L)),
					(new Actor("DDD", "ddd", 856789738197L)), (new Actor("EEE", "eee", 5456738197L)));
			String actorsFroup = serviceImpl.registerActorsGroup(list);
			System.out.println(actorsFroup);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}


	}

}
