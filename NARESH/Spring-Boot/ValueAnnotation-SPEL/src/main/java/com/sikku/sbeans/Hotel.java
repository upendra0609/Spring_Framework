package com.sikku.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotel")
@Data
public class Hotel {
	//assigning direct value to id
	@Value("123")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.add}")
	private String hotelAdd;
	@Value("${hotel.mobile}")
	private String hotelMobile;
	@Value("${hotel.cust}")
	private String custName;
	//here menup is bean id idlyPrice 
	@Value("#{menup.idlyPrice+menup.pohaPrice}")
	private Float billAmount;
	@Value("${os.name}")
	private String osName;

}
