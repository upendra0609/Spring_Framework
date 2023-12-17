package com.sikku.beans;

import org.springframework.stereotype.Component;

@Component("pengine")
public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("0 arg petrol constructor");

	}

	@Override
	public void start() {
		System.out.println("Petrol engine started");

	}

	@Override
	public void stop() {
		System.out.println("Petrol engine stopped");

	}

}
