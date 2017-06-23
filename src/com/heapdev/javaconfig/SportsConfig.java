package com.heapdev.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.heapdev.javaconfig")
public class SportsConfig {
	
	@Bean
	public FortuneService hapyFortuneService(){
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach cricketCoaching(){
		return new CricketCoach(hapyFortuneService());
	}
}
