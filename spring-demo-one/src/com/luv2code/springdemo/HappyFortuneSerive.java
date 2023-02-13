package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneSerive implements FortuneService {
	
	private Random rand = new Random();

	@Override
	public String getFortune() {
		String[] fortune = {"Today is your lucky day!", "Have a nice day!", "Have a good Day People!"};
		return fortune[rand.nextInt(fortune.length)];
//		return "Today is your lucky day!";
	}

}
