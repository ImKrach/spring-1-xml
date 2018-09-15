package com.krach.coach;

import com.krach.coach.services.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5kms";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
