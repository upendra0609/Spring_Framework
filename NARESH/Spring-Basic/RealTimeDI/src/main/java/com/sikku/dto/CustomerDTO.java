package com.sikku.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cno;
	private String cname;
	private String cadd;
	private Double pamt;
	private Double rate;
	private Double time;

}
