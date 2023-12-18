package com.sikku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.repository.IActorRepository;

@Service("actorService")
public class ActorManagementServiceImpl implements IActorManagementService {
	@Autowired
	private IActorRepository actorRepo;




}
