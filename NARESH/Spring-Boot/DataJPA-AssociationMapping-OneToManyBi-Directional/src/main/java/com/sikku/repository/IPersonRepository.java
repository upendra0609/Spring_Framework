package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.entities.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
