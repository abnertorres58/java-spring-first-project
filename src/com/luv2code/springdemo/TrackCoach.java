package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach (FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It!!" + fortuneService.getFortune();
    }

    //Add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: Inside method doMyStartupStuff");
    }

    //Add a destroy method
    public void doMyCleanStuffYoYo(){
        System.out.println("TrackCoach: Inside method doMyCleanStuffYoYo");
    }
}
