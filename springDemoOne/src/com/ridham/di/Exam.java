package com.ridham.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student ridham = (Student) context.getBean("student");
		
		//	ridham.setStudent("ridham");
		
		ridham.displayInfo();
		
				
		
				

	}

}
