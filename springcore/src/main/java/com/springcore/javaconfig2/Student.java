package com.springcore.javaconfig2;

public class Student {
	
	private Samosa samosa;	//dependencies

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public void study() 
	{
		System.out.println("i am stuyding");
		this.samosa.display();
	}

}
