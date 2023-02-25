package com.ridham.autowired;
import javax.annotation.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotation.xml");
		
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Human human = context.getBean("human",Human.class);
		human.StartPumping();
		
		context.close();

	}
	

}
