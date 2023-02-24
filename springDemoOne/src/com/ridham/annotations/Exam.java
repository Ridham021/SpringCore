package com.ridham.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args){
		
		
		
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		System.out.println(context);
		Student ridham = (Student) context.getBean("student1");
		
		//	ridham.setStudent("ridham");
		
		//ridham.displayInfo();
	
		
		
		
				
		
				

	}

}
