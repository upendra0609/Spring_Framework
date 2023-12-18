package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sikku.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

//	@Query("from Actor where category=?1")
//	public Iterable<Actor> searchActorByCategory(String category);
	
	@Query("from Actor where category=:role")
	public Iterable<Actor> searchActorByCategory(String role);
}
