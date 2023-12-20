package com.sikku.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.entity.Person;
import com.sikku.repository.IPersonRepository;

@Service
public class PersonMgmtServiceImpl {
	@Autowired
	private IPersonRepository repository;

	public String registerPerson(Person person) {
		Person save = repository.save(person);

		return "Person is saved with id: " + save.getPid();
	}

	public List<Person> fetchAllPerson() {
		return repository.findAll();
	}

}
