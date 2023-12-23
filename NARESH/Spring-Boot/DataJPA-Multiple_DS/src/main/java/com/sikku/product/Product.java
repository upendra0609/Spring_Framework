package com.sikku.product;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Product_Multi")
public class Product implements Serializable {
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length = 20)
	@NonNull
	private String pname;
	@NonNull
	private Double price;
	@NonNull
	private Double qty;

}
