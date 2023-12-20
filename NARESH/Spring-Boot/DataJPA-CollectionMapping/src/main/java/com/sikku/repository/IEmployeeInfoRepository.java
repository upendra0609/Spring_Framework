package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.entities.EmployeeInfo;

public interface IEmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

}
