package com.sgd.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileFortuneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
