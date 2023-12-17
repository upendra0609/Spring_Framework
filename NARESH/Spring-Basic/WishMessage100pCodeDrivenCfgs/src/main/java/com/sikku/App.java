package com.sikku;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sikku.beans.WishMessageGenerator;
import com.sikku.cgfs.AppConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator msg = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println(msg.generateWishMessage("Dhoni"));
		context.close();
	}
}
