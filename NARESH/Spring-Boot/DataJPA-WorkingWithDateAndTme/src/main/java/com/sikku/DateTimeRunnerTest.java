package com.sikku;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entity.Person;
import com.sikku.services.PersonMgmtServiceImpl;

@Component
public class DateTimeRunnerTest implements CommandLineRunner {
	@Autowired
	private PersonMgmtServiceImpl serviceImpl;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*
			 * Person person = new Person(); person.setPname("Suresh");
			 * person.setPage(60.0f); person.setDOB(LocalDate.of(1990, 10, 20));
			 * person.setTOB(LocalTime.of(17, 20, 30,100));
			 * person.setDOJ(LocalDateTime.of(2010, 9, 21, 16, 20, 4));
			 * 
			 * String registerPerson = serviceImpl.registerPerson(person);
			 */
			
			List<Person> list = serviceImpl.fetchAllPerson();
			
			list.stream().forEach(person->System.out.println(person));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
