package com.heapdev.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.heapdev.javaconfig")
public class SportsConfig {
	
	@Bean
	public FortuneService happyFortuneService(){
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach cricketCoaching(){                     // Method name with small first letter "cricketCoaching" is the id
		return new CricketCoach(happyFortuneService());
	}
}