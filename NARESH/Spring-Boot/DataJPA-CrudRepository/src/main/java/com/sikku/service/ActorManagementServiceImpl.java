package com.sikku.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public String registerActorsGroup(List<Actor> actors) {
		ArrayList<Actor> list = (ArrayList<Actor>) actorRepo.saveAll(actors);
		return list.stream().map((i) -> i.getAid()).collect(Collectors.toList()).toString();

	}

}
