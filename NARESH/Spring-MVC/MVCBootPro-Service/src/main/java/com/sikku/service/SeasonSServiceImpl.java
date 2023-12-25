package com.sikku.service;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonSServiceImpl implements ISeasonService {

	@Override
	public String findSeason() {

		return "This is winter Season";
	}

}
