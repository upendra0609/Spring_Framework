package com.sikku.service;


import java.util.List;

import com.sikku.entity.Actor;

public interface IActorManagementService {
	String register(Actor actor);
	String registerActorsGroup(List<Actor> actor);

}