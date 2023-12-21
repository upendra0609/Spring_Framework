package com.sikku.services;

import java.util.Set;

import com.sikku.entities.Person;
import com.sikku.entities.PhoneNumber;

public interface IpersonMgmtService {
	String saveDataUsingPerson(Person person);
	String saveDataUsingPhoneNumber(Set<PhoneNumber> phones);

}
