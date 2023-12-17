package com.sikku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sikku.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	//public <return type> findBy<propertyName><condition>(params...);
	public List<Actor> findByAnameEquals(String name);
}
