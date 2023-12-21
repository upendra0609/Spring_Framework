package com.sikku.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PERSON_OTM")
@Getter
@Setter
@ToString
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 1000, allocationSize = 5, sequenceName = "PID_GEN")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	private Integer pid;
	@Column(length = 20)
	private String pname;
	@Column(length = 30)
	private String paddr;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = PhoneNumber.class,mappedBy = "person")
	private Set<PhoneNumber> phones;

}
