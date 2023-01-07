package com.sgd.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {
	
	public static void main(String args[]) {
		
		//Get the application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
	
}
