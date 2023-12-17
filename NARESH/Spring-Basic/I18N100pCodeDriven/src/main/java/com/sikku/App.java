package com.sikku;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikku.cfgs.AppConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Get message from property file according to the locale we submit

		Locale locale = new Locale(args[0], args[1]);
		String msg1 = context.getMessage("wish.msg", new String[] {}, locale);
		String msg2 = context.getMessage("bye.msg", new String[] {}, locale);
		System.out.println(msg1 + "   " + msg2);
	}
}
