package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    //generate no argument constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    //define a constructor for dependency injection
    public CricketCoach (FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    //our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        //use y fortuneService to get some fortune
        return fortuneService.getFortune();
    }
}
