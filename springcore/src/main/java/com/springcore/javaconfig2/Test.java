package com.springcore.javaconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(Javaconfig2.class);
		
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
		
	}

}
 