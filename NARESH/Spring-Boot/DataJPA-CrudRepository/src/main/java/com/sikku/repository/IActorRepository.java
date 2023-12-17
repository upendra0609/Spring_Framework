package com.sikku.repository;

import org.springframework.data.repository.CrudRepository;

import com.sikku.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {

}
