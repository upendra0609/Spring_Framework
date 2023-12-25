package com.sikku.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sikku.service.ISeasonService;

@Controller
public class SeasonController {

	@Autowired
	private ISeasonService service;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/season")
	public String getSeason(Map<String, Object> map) {
		String season = service.findSeason();
		map.put("season", season);
		return "season";
	}

}
