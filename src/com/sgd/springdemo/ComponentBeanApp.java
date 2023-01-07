package com.sgd.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentBeanApp {

	public static void main(String[] args) {
		
		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get bean from spring container
		
		Coach theCoach = context.getBean("cricketCoach",Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
