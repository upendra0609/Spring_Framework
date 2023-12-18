package com.sikku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sikku.entity.Actor;
import com.sikku.entity.ResultView;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	// public <return type> findBy<propertyName><condition>(params...);
	public List<Actor> findByAnameEquals(String name);

	public List<ResultView> findByCategoryEqualsIgnoreCase(String category);
}
