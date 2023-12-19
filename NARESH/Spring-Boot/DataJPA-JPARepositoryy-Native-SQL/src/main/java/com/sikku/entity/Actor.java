package com.sikku.entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "DATA_JPA_ACTOR")
@DynamicInsert(true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;

	@Column(name = "ACTOR_Name", length = 20) // if column name and class name are different
	@NonNull
	private String aname;

	@Column(name = "CATEGORY", length = 20)
	@NonNull
	private String category;

	@Column(name = "Mobile_Number")
	@NonNull
	private Long mobileNo;

}
