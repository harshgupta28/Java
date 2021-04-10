package com.springcore.javaconfig1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration		//no requirement of xml file now
@ComponentScan(basePackages = "com.springcore.javaconfig1")
public class Javaconfig1 {
	
}
