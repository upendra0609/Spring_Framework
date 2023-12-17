package com.sikku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.entity.Actor;
import com.sikku.repository.IActorRepository;

@Service("actorService")
public class ActorManagementServiceImpl implements IActorManagementService {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String register(Actor actor) {
		String result = "";
		Actor act = actorRepo.save(actor);
		if (act != null) {
			result = "Actor is registered with id value " + act.getAid();
		} else {
			result = "Actor not saved";
		}
		return result;
	}
}
