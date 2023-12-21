package com.sikku.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entities.Person;
import com.sikku.entities.PhoneNumber;
import com.sikku.services.PersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private PersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		//Parent to child
		/*
		 * try { Person person = new Person();
		 * 
		 * person.setPname("Rahul"); person.setPaddr("Pune");
		 * 
		 * PhoneNumber pNumber1 = new PhoneNumber(); pNumber1.setNumberType("Personal");
		 * pNumber1.setPerson(person); pNumber1.setProvider("Jio");
		 * pNumber1.setPhoneNumber(123456789L);
		 * 
		 * PhoneNumber pNumber2 = new PhoneNumber(); pNumber2.setNumberType("office");
		 * pNumber2.setPerson(person); pNumber2.setProvider("Airtel");
		 * pNumber2.setPhoneNumber(9876543210L);
		 * 
		 * Set<PhoneNumber> phonesNumbers = Set.of(pNumber1,pNumber2);
		 * person.setPhones(phonesNumbers);
		 * 
		 * String saveDataUsingPerson = service.saveDataUsingPerson(person);
		 * System.out.println(saveDataUsingPerson);
		 * 
		 * } catch (DataAccessException e) { e.printStackTrace(); }
		 */
		
		//Child to parent
		try {
			Person person = new Person();
			person.setPname("Raja");
			person.setPaddr("Hyd");
	
			
			PhoneNumber p1 = new PhoneNumber();
			p1.setNumberType("off");
			p1.setPerson(person);
			p1.setPhoneNumber(99999L);
			p1.setProvider("VI");
			
			PhoneNumber p2 = new PhoneNumber();
			p2.setNumberType("res");
			p2.setPerson(person);
			p2.setPhoneNumber(88888L);
			p2.setProvider("Airtel");
			
			
			Set<PhoneNumber> set = Set.of(p1,p2);
			
			String saveDataUsingPhoneNumber = service.saveDataUsingPhoneNumber(set);
			System.out.println(saveDataUsingPhoneNumber);
			
		} catch (DataAccessException e) {
			// TODO: handle exception
		}

	}

}
