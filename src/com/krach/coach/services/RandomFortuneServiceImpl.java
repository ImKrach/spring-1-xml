package com.krach.coach.services;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneServiceImpl implements FortuneService {
    
    private ArrayList<String> listeFortunes;

    public RandomFortuneServiceImpl() {
        this.listeFortunes = new ArrayList<String>();
        this.listeFortunes.add("This is a Happy Day");
        this.listeFortunes.add("This is a Sad Day");
        this.listeFortunes.add("This is a Lovely Day");
        this.listeFortunes.add("This is a Worthy Day");
        this.listeFortunes.add("This is a Hard Day");
    }

    @Override
    public String getFortune() {
        return this.listeFortunes.get(ThreadLocalRandom.current().nextInt(0, 5));
    }

}