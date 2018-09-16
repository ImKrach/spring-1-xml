package com.krach.coach;

import com.krach.coach.services.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5kms";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
