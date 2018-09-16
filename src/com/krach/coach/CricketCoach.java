package com.krach.coach;

import com.krach.coach.services.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

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

}