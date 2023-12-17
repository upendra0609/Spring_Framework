package com.sikku.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("fpkt")
public class Flipkart {
	@Autowired
//	@Qualifier("${courier.name}")//invalid
	@Qualifier("delivery")
	private Courier courier;

}
