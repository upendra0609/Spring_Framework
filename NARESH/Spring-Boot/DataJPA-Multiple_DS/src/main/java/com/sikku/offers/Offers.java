package com.sikku.offers;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Offers_Multi")
@Entity
public class Offers implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	@SequenceGenerator(name = "gen1", initialValue = 1000,allocationSize = 1, sequenceName = "oid_seq")
	private Integer oid;
	@Column(length = 20)
	@NonNull
	private String offerName;
	@NonNull
	private Double discount;
	@NonNull
	private LocalDate validTo;
	

}
