package com.sikku.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entities.EmployeeInfo;
import com.sikku.repository.IEmployeeInfoRepository;

@Component
public class CollectionMappingTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeInfoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		try {
//			EmployeeInfo info = new EmployeeInfo();
//			info.setEname("Rahul");
//			info.setFriends(List.of("Rani", "raju"));
//			info.setPhones(Set.of(1234567890L, 9876543210L));
//			info.setIdDetails(Map.of("aadhar", 1414134L, "PAN", 75827L));
//			EmployeeInfo save = repository.save(info);
//			System.out.println("Employee is saved with id: " + save.getEno());
			
			List<EmployeeInfo> findAll = repository.findAll();
			
			findAll.forEach(System.out::println);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
