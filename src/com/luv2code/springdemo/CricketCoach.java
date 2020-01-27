package com.luv2code.springdemo;

public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice your aim for at least an hour a day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
