package com.sikku.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Emp_Data")
@Data
public class Employee {
	@Id
	private Integer eno;
	private String ename;
	private String eaddr;
	private Double esalary;
	private Boolean isVaccinated;

}
