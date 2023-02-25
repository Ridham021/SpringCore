package com.java.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	private int id;
	private String name;
	
	public Student() {
		System.out.println("default constructor called");
		this.id = 2;
		this.name = "raj";
	}
	
	
	
	
	public void displayInfo() {
		System.out.println("id : "+id+", name : "+name);
	}
	
	
	
	
	
	
	

}
