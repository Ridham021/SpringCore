package com.ridham.di;

public class Student {
	
	private int id;
	private String student;

	
	public Student( String student,int id) {
		//super();
		this.id = id;
		this.student = student;
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
