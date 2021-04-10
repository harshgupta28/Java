package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
      AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
      
      Xmlcycle x=(Xmlcycle) context.getBean("x");
      System.out.println(x);
      //registering shutdown hook
      context.registerShutdownHook();
      
      System.out.println("\n++++++++++++++++++++++++++++++++++\n");
      
      Interfacecycle i=(Interfacecycle) context.getBean("i");  
      System.out.println(i);
      
      

      System.out.println("\n++++++++++++++++++++++++++++++++++\n");
      
      Annotationcycle a=(Annotationcycle) context.getBean("a");  
      System.out.println(a);
      

      
	}

}
