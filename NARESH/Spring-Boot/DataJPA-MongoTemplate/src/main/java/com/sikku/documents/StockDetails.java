package com.sikku.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "STOCK_INFO")
@AllArgsConstructor
@NoArgsConstructor
public class StockDetails {
	private Integer stockId;
	private String stockName;
	private Double price;
	private String exchangeName;

}
