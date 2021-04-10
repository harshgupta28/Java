package com.springcore.javaconfig1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(Javaconfig1.class);
		
		Student student = context.getBean("firststudent",Student.class);
		System.out.println(student);
		
	}

}
 