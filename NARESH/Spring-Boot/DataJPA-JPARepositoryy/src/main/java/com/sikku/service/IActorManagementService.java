package com.sikku.service;


import java.util.List;

import com.sikku.entity.Actor;
import com.sikku.entity.ResultView;

public interface IActorManagementService {
	List<Actor> findAllActor();
	void deleteById(List<Integer> ids);
	List<Actor> findByActorName(String actorName);
	public List<ResultView> findByCategoryEqualsIgnoreCase(String category);

}