package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sikku.entity.Actor;

import jakarta.transaction.Transactional;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {

	@Query("update Actor set mobileNo=:newMobileNo where aid=:id")
	@Modifying
	public int updateActorMobileNo(Long newMobileNo, Integer id);
}
