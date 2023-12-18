package com.sikku.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entity.Actor;
import com.sikku.repository.IActorRepository;
import com.sikku.service.ActorManagementServiceImpl;

@Component
public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private IActorRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			List<Actor> actorByCategory = (List<Actor>) repository.searchActorByCategory("bollywood");
			System.out.println(actorByCategory.size());
			actorByCategory.stream().forEach(actor -> System.out.println(actor));

		} catch (DataAccessException e) {
			// TODO: handle exception
		}

	}

}
