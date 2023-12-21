package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.entities.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

}
