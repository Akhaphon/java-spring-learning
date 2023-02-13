package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run to hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do iT: " + fortuneService.getFortune();
	}
	
	// add a init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff.");
	}
	
	// add a destroy method
	public void doMyStartupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoyo");
	}
}
