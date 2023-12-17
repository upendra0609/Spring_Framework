package com.sikku.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sikku.entity.Actor;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {

}
