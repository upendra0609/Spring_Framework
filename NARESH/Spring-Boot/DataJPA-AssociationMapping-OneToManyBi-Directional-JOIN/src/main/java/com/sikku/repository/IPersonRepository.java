package com.sikku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sikku.entities.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
	
//	@Query("select p.pid, p.pname, p.paddr, ph.phoneNumber, ph.numberType, ph.provider from Person p inner join p.phones ph")
//	@Query("select p.pid, p.pname, p.paddr, ph.phoneNumber, ph.numberType, ph.provider from Person p right join p.phones ph")
	@Query("select p.pid, p.pname, p.paddr, ph.phoneNumber, ph.numberType, ph.provider from Person p left join p.phones ph")
	public List<Object[]> fetchDataUsingJoinsByParent();
}