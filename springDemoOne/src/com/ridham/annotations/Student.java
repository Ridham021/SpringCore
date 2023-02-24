package com.ridham.annotations;

import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	
	private int id;
	private String student;

	
	public Student() {
		//super();
		this.id = 2;
		this.student = "Ridham";
	}


	/*
	 * public void setStudent(String student) { this.student = student; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */
	
	public void displayInfo() {
		
		System.out.println("Student name : "+student+" id is : "+id);
		
	}
	
	


}
