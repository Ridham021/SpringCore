package com.ridham.autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
	
	
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}


	public void StartPumping() {
		
		heart.pump();
		System.out.println("type : "+heart.getName()+", No.of Hearts : "+heart.getNoOfHearts());
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("This is PostConstruct");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("This is PreDestroy");
	}

}
