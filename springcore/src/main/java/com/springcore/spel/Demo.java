package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{120+4}")
	private int x;
	
	@Value("#{5>4 ?55:44}") //expression
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(16)}") //invoking static method
	private double z;
	
	@Value("#{T(java.lang.Math).E}") //invoking variable
	private double e;
	
	@Value("#{new String('harsh')}") //creating and passing objects //pass string in single quotes as the expression 
																		//is already in double quotes
	private String s;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", s=" + s + "]";
	}

}
