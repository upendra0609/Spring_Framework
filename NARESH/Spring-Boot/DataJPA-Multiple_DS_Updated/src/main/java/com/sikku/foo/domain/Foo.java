package com.sikku.foo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "FOO")
@Data
public class Foo {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "FOO")
	private String foo;

	Foo(String foo) {
		this.foo = foo;
	}

	public Foo() {
		// Default constructor needed by JPA
	}
}