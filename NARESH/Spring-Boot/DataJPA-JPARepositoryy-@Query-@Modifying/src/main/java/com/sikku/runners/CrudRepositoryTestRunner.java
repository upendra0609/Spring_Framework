package com.sikku.runners;

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
			int update = repository.updateActorMobileNo(949494949L, 5);
			System.out.println(update==1?"updated":"not updated");
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}

}
