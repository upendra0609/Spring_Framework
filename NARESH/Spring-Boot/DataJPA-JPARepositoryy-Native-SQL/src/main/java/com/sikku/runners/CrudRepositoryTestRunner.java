package com.sikku.runners;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.repository.IActorRepository;

@Component
public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private IActorRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			int actor = repository.insertActor("ZZZ", "bolowood", 12451254215L);
			System.out.println(actor);
			
			Date date = repository.showDate();
			System.out.println(date);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
