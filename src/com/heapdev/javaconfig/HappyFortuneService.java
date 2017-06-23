package com.heapdev.javaconfig;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Congratulations team for your winning streak.";
	}
}
