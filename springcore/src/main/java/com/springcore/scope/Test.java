package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/scope/tempconfig.xml");
		
		Temp temp = context.getBean("temp",Temp.class);
		System.out.println(temp.hashCode());
		
		Temp temp1 = context.getBean("temp",Temp.class);
		System.out.println(temp1.hashCode());
		
		Temp tempproto = context.getBean("tempproto",Temp.class);
		System.out.println(tempproto.hashCode());
		
		Temp tempproto1 = context.getBean("tempproto",Temp.class);
		System.out.println(tempproto1.hashCode());
	}

}
 