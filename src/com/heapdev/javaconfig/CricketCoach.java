package com.heapdev.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket => Workout";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
