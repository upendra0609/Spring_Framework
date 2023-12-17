package com.sikku.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msg")
public class WishMessageGenerator {
	public WishMessageGenerator() {
		System.out.println("o arg constructor");
	}

	@Autowired
	@Qualifier(value = "dt")
	private LocalDateTime date;

	public String getMessage(String user) {
		return date + " Good Evening! " + user;
	}

}
