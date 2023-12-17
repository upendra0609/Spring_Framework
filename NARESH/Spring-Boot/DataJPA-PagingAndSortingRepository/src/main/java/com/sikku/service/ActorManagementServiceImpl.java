package com.sikku.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sikku.entity.Actor;
import com.sikku.repository.IActorRepository;

@Service("actorService")
public class ActorManagementServiceImpl implements IActorManagementService {
	@Autowired
	private IActorRepository actorRepo;


	@Override
	public List<Actor> findAllActor(Boolean inAsc, String ...sortBy) {
		Sort sort = Sort.by(inAsc?Direction.ASC:Direction.DESC, sortBy);
		
		List<Actor> allActor = (List<Actor>)actorRepo.findAll(sort);
		return allActor;
	}
	
	@Override
	public List<Actor> findActorByPage(Integer pageNo, Integer pageSize) {
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		
		Page<Actor> findAll = actorRepo.findAll(pageRequest);
		List<Actor> allActor = findAll.getContent();
		return allActor;
	}

	

}
