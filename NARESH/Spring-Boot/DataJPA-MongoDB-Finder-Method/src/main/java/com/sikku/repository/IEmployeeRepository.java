package com.sikku.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sikku.documents.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {
	public List<Employee> findByEsalaryBetween(Double start, Double end);
}
