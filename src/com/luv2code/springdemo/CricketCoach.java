package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    //adding a new fields for email and team

    private String emailAddress;
    private String team;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress (String emailAddress){
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
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
