package com.sikku.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sikku.offers.Offers;
import com.sikku.product.Product;
import com.sikku.repo.offers.IOffersRepo;
import com.sikku.repo.product.IProductRepo;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private IProductRepo productRepo;
//	@Autowired
//	private IOffersRepo offersRepo;

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product("Table", 1200.0, 123.0);
		Product save = productRepo.save(product);
		System.out.println(save.getPid()+" saved");
		
		Offers offers = new Offers("summer", 200.0, LocalDate.of(2023, 12, 27));
		
//		Offers save2 = offersRepo.save(offers);
//		System.out.println(save2.getOid()+" saved");
	}

}
