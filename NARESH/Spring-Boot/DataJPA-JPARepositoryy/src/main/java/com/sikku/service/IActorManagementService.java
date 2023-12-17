package com.sikku.service;


import java.util.List;

import com.sikku.entity.Actor;

public interface IActorManagementService {
	List<Actor> findAllActor();
	void deleteById(List<Integer> ids);
	List<Actor> findByActorName(String actorName);

}