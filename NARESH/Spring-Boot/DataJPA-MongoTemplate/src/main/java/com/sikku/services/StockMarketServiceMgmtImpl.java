package com.sikku.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.sikku.documents.StockDetails;

@Service
public class StockMarketServiceMgmtImpl {

	@Autowired
	private MongoTemplate template;

	public String registerStock(StockDetails details) {
//		return "Stock saved with id: " + template.save(details, "Stock_INFO").getStockId();
		return "Stock saved with id: " + template.insert(details).getStockId();
	}

}
