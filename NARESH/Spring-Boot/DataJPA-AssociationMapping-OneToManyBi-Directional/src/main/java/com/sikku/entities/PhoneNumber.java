package com.sikku.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PhoneNumer_OTM")
@Setter
@Getter
@ToString
public class PhoneNumber {
	@Id
	@GeneratedValue
	private Integer regno;
	private Long phoneNumber;
	@Column(length = 20)
	private String numberType;
	@Column(length = 20)
	private String provider;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Person.class)	
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	private Person person;
	

}
