package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
}
