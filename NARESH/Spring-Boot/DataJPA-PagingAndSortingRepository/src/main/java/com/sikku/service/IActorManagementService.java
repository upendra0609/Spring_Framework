package com.sikku.service;


import java.util.List;

import com.sikku.entity.Actor;

public interface IActorManagementService {
	List<Actor> findAllActor(Boolean inAsc, String ...sortBy);
	List<Actor> findActorByPage(Integer pageNo, Integer pageSize);

}