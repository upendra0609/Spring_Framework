package com.sikku.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikku.entities.Person;
import com.sikku.entities.PhoneNumber;
import com.sikku.repository.IPersonRepository;
import com.sikku.repository.IPhoneNumberRepository;

@Service("personService")
public class PersonMgmtService implements IpersonMgmtService {
	@Autowired
	private IPersonRepository repository;

	@Autowired
	private IPhoneNumberRepository repository2;

	@Override
	public String saveDataUsingPerson(Person person) {
		Person save = repository.save(person);
		return "saved with id: " + save.getPid();
	}

	@Override
	public String saveDataUsingPhoneNumber(Set<PhoneNumber> phones) {
		List<PhoneNumber> saveAll = repository2.saveAll(phones);
		return saveAll.size() + " ";
	}
	
	@Override
	public List<Object[]> getDataUsinggPersonByJoins() {
		return repository.fetchDataUsingJoinsByParent();
	}

}
