package com.sikku.beans;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("eng")
	private IEngine engine;


	public Vehicle() {
		System.out.println("0 arg vehicle constructor");
	}

	public void ride(String start, String end) {
		engine.start();
		System.out.println("journey started from " + start);
		System.out.println("journey stopped at " + end);
		engine.stop();

	}

}
