package com.sikku.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sikku.documents.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {

}
