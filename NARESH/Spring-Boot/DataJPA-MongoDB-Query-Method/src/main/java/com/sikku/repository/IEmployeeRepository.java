package com.sikku.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sikku.documents.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {
	
	@Query(value ="{isVaccinated:true}", count=true)
	public int countEmp();
	
	@Query(value = "{ename:{'$regex':?0}}")
	public Optional<Employee> getEmpByNameStartWith(String name);
	

}
