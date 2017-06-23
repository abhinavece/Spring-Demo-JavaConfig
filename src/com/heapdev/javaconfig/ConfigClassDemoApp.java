package com.heapdev.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigClassDemoApp {
	
	public static void main(String[] args) {
		
		// load the Spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// retrieve bean from container
		CricketCoach cricCoach = context.getBean("cricketCoaching", CricketCoach.class);
		
		// call method on retrieved bean
		System.out.println(cricCoach.getDailyWorkout());
		System.out.println(cricCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
