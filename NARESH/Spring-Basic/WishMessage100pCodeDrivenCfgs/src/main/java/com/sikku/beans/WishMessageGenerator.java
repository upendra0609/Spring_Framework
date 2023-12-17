package com.sikku.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime date;

	public String generateWishMessage(String user) {
		return date + " Good Evening! " + user;
	}

}
