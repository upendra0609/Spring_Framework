package com.sikku.beans;

import org.springframework.stereotype.Component;

@Component("dengine")
public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("0 arg diesel constructor");

	}

	@Override
	public void start() {
		System.out.println("diesel engine started");

	}

	@Override
	public void stop() {
		System.out.println("diesel engine stopped");

	}

}
