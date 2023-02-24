package com.ridham.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args){
		
		try {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		
		Student ridham = (Student) context.getBean("student1");
		
		//	ridham.setStudent("ridham");
		
		ridham.displayInfo();
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
		
		
		
				
		
				

	}

}
