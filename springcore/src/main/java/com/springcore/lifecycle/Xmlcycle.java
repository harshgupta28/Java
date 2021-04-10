package com.springcore.lifecycle;

public class Xmlcycle {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

		public Xmlcycle() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	@Override
	public String toString() {
		return "Xmlcycle [price=" + price + "]";
	}
    public void init()
    {
    	System.out.println("inside init method : xml");
    }
    public void destroy()
    {
    	System.out.println("inside destroy method :xml");
    }
}
