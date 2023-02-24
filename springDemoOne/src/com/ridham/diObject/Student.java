package com.ridham.diObject;



public class Student {
	
	private int id;
	private MathCheat mathCheat ;
	public void setId(int id) {
		this.id = id;
	}


	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}



	
	
	public void displayInfo() {
		System.out.println("Student : "+mathCheat.getCheat()+" id : "+id);
	}
	
	

}
