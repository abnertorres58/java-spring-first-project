package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public CricketCoach (FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your aim for at least an hour a day";
    }

    @Override
    public String getDailyFortune() {
        //use y fortuneService to get some fortune
        return fortuneService.getFortune();
    }
}
