package com.sikku.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.entities.PersonInfo;
import com.sikku.repository.IPersonInfoRepository;

@Service("personService")
public class PersonInfoMgmtServiseImpl {
	@Autowired
	private IPersonInfoRepository repository;
	
	public String rgisterPerson(PersonInfo info) {
		PersonInfo save = repository.save(info);
		return "person saved with id: "+ save.getPid();
	}
	
	public List<PersonInfo> getAllPersonInfo() {
		return repository.findAll();
	}

}
