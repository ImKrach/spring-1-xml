package com.krach.coach;

import com.krach.coach.services.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String email;

    // Si je n'avais pas créé de no-arg constructor, ni aucun constructor du tout : alors il sera créé automatiquement
    public CricketCoach() {
        System.out.println("Nous sommes dans le no-arg constructor de CricketCoach.");
    }

    @Override
    public String getDailyWorkout() {
        return "Manger un criquet";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Nous sommes dans le CricketCoach:setFortuneService().");
        this.fortuneService = theFortuneService;
    }


    /**
     *  Getters and setters
     */
    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}