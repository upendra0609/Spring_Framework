package com.sikku.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
public class Comapny {
	private Integer id;
	private String name;
	private String add;
	private String size;

}
