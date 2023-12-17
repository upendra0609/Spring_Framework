package com.sikku.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties("org.nit")
@Data
@Component("emp")
public class Employee {
//	simple property
	private Integer eno;
	private String ename;
//	array type
	private String[] favColors;
//	Collection type
	private List<String> nickNames;
	private Set<Long>  phoneNumbers;
	private Map<String, String> idDetails;
//	Has-A	
	private Comapny comapny;

}
