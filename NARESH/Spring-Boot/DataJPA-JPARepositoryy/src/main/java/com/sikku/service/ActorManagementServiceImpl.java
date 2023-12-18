package com.sikku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.entity.Actor;
import com.sikku.entity.ResultView;
import com.sikku.repository.IActorRepository;

@Service("actorService")
public class ActorManagementServiceImpl implements IActorManagementService {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public List<Actor> findAllActor() {
		List<Actor> allActor = (List<Actor>) actorRepo.findAll();
		return allActor;
	}

	@Override
	public void deleteById(List<Integer> ids) {
		actorRepo.deleteAllById(ids);
	}

	@Override
	public List<Actor> findByActorName(String actorName) {
		List<Actor> list = actorRepo.findByAnameEquals(actorName);
		return list;
	}

	@Override
	public List<ResultView> findByCategoryEqualsIgnoreCase(String category) {
		return actorRepo.findByCategoryEqualsIgnoreCase(category);
	}

}
