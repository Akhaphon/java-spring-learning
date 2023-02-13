package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "run run run. footBall Coach.!!!";
	}

	@Override
	public String getDailyFortune() {
		return "foot foot foor!";
	}

}
