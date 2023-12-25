package com.sikku.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Student {
	private Integer sno;
	private String sname;
	private String saddr;
	private LocalDate sdob;

}
