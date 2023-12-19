package com.sikku.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;

	@Column(length = 20) // if column name and class name are different
	@NonNull
	private String aname;

	@Column(length = 20)
	@NonNull
	private String category;

	@Column(nullable = true, unique = true)
	@NonNull
	private Long mobileNo;

}
