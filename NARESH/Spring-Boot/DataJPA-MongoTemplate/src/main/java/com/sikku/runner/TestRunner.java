package com.sikku.runner;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sikku.documents.StockDetails;
import com.sikku.services.StockMarketServiceMgmtImpl;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private StockMarketServiceMgmtImpl serviceMgmtImpl;

	@Override
	public void run(String... args) throws Exception {
		StockDetails details = new StockDetails(new Random().nextInt(1000), "ICICI", 900.65, "BSE");
		String stock = serviceMgmtImpl.registerStock(details);
		System.out.println(stock);

	}

}
