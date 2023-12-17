package com.sikku.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cktr")
@PropertySource(value = "classpath:com/sikku/commons/info.properties")
@Data
public abstract class Cricketer {
	@Value("${cricketer.name}")
	private String name;
	@Value("${cricketer.jersy}")
	private String jersyNo;

	public void batting() {
		CricketBat bat = getBat();
		int run = bat.getRun();
		System.out.println(name + " with jersy number " + jersyNo + " has scored " + run + " runs");
	}

	@Lookup
	public abstract CricketBat getBat();

}
