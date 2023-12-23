package com.sikku.bar.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "BAR")
@Data
public class Bar {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "BAR")
	private String bar;

	Bar(String bar) {
		this.bar = bar;
	}

	public Bar() {
		// Default constructor needed by JPA
	}
}
