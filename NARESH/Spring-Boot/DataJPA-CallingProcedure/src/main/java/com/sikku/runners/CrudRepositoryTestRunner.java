package com.sikku.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sikku.entity.Actor;
import com.sikku.repository.IActorRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_ACTORS_BY_CATEGORIES", Actor.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Actor.class, ParameterMode.REF_CURSOR);

		query.setParameter(1, "bollywood");
		query.setParameter(2, "hollywood");

		List<Actor> list = query.getResultList();

		list.stream().forEach(act -> System.out.println(act));

	}

}
