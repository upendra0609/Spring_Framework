package com.sikku.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sikku.entity.Actor;

import jakarta.transaction.Transactional;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {

	@Query(nativeQuery = true, value = "insert into DATA_JPA_ACTOR values(AID_SEQ.NEXTVAL,?,?,?)")
	@Modifying
	public int insertActor(String name, String category, Long mobileNo);
	
	@Query(nativeQuery = true, value = "SELECT SYSDATE FROM DUAL")
	public Date showDate();
}
