package com.sikku.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PERSON_INFO_LOBS")
public class PersonInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	@Column(length = 20)
	private String pname;
	private LocalDateTime dob;
	private Boolean isMarried;
	@Lob
	@Column(length = 100000)
	private byte[] photo;
	@Lob
	@Column(length = 100000)
	private char[] resume;
}
