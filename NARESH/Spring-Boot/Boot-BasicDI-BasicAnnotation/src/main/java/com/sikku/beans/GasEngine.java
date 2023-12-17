package com.sikku.beans;

import org.springframework.stereotype.Component;

@Component("gengine")
public class GasEngine implements IEngine {
	public GasEngine() {
		System.out.println("0 arg gas constructor");

	}

	@Override
	public void start() {
		System.out.println("gas engine started");

	}

	@Override
	public void stop() {
		System.out.println("gas engine stopped");

	}

}
