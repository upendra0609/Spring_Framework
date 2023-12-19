package com.sikku.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sikku.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
public class CrudRepositoryTestRunner implements ApplicationRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// create StroredProcdureQuery Object having PL/SQL Procedure name , result type
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_ACTORS_BY_CATEGORIES", Actor.class);
		// register both IN ,OUT params of PL/SQL procedure
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR); // registering out param
		// set values to IN params
		query.setParameter(1, "bollywood");
		query.setParameter(2, "hollywood");
		// call PL/SQL procedure
		List<Actor> list =(List<Actor>) query.getResultList();
		// proecess the result
		list.forEach(System.out::println);

	}

}
