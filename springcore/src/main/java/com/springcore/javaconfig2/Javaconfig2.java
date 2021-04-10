package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		//no requirement of xml file now
public class Javaconfig2 {
	
	@Bean // we add bean so that spring container can make object of it
	public Samosa getSamosa()	
	{
		Samosa samosa = new Samosa();
		
		return samosa;
	} 
	
	@Bean
	public Student getStudent()	//the method name here is the object reference in test class
	{
		//creating a bean object
		Student student = new Student(getSamosa());
		
		return student;
	}

}
