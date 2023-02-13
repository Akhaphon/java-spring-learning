package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPoint tot hte same object " + result);
		
		System.out.println("\nMemory location for the Coach: " + theCoach);

		System.out.println("\nMemory location for the alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();

	}

}
