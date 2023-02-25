package com.java.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class Main 
{
    public static void main( String[] args )
    {
    
//    	ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("beans.xml");
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
		
		Student ridham = (Student) context.getBean("student");
    	ridham.displayInfo();
    	
        
    }
}
