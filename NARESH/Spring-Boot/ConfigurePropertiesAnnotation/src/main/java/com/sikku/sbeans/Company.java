package com.sikku.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
@ConfigurationProperties(prefix = "company.prop")
public class Company {
	@Value("${org.id}")
	private Integer id;
	private String name;
	private String add;
	private Long mobile;
	
	@Value("${id}")
	private Integer iid;

}
