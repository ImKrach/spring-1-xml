package com.krach.coach;

import com.krach.coach.services.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes coding";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
