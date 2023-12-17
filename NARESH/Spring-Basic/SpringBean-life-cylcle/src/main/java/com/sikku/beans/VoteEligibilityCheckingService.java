package com.sikku.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Component("votiong")
@PropertySource(value = "com/sikku/commons/Info.properties")
public class VoteEligibilityCheckingService {
	@NonNull
	@Value("${voter.age}")
	private Integer age;
	@NonNull
	@Value("${voter.name}")
	private String name;
	@Setter
	private Date date;

	public String checkingVotingElligibility() {
		System.out.println("business method");
		if (age < 18) {
			return "not elligible";
		} else {
			return "elligible" + name + "  " + age;
		}
	}

	/* this method will execute after DI */
	@PostConstruct
	public void init() {
		System.out.println("init");
		date = new Date();
		if (age < 0 || name == null) {
			throw new IllegalArgumentException("invalid input");
		}
	}

	/* this method will execute before bean destroy */
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
		age = null;
		name = null;
		date = null;
	}

}
