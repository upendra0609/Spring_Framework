package com.sikku.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DATA_JPA_ACTOR")
@Data
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name = "ACTOR_Name", length = 20) // if column name and class name are different
	private String aname;
	@Column(name = "CATEGORY", length = 20)
	private String caategory;
	@Column(name = "Mobile_Number")
	private Long mobileNo;

}
