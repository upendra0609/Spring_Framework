package com.sikku.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sikku.beans.WishMessageGenerator;

@Component
public class MyRunner implements ApplicationRunner {
	@Autowired
	private WishMessageGenerator generator;

	@Override
	public void run(ApplicationArguments args) throws Exception {		
		System.out.println("Runner");
		System.out.println(generator.getMessage("Ram"));		
	}

}
