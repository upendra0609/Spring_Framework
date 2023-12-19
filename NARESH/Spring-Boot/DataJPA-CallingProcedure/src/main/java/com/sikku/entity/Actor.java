package com.sikku.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "actor")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // generator cfg
	private Integer aid;

	// @NonNull
	@Column(length = 20)
	private String aname;

	// @NonNull
	@Column(length = 20)
	private String category;

	// @NonNull
	@Column(unique = true, nullable = true)
	private Long mobileNo;

}
