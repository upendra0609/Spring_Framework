package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.entities.PersonInfo;

public interface IPersonInfoRepository extends JpaRepository<PersonInfo, Integer> {

}
