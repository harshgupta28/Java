package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotationcycle {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

		public Annotationcycle() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	@Override
	public String toString() {
		return "Xmlcycle [price=" + price + "]";
	}
	
	@PostConstruct
    public void init()
    {
    	System.out.println("inside init method : annotation");
    }
	@PreDestroy
    public void destroy()
    {
    	System.out.println("inside destroy method :annotation");
    }
}

