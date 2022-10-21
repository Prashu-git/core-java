package com.xworkz.icecream;

public class IceCream {
	String name ;
	double price;
	
	
	public IceCream () {
		
	}
	
	public IceCream (String na , double rate) {
		
		this.name = na;
		this.price =  rate;
		
	}
	
	public void toEat() {
		
		System.out.println("Lets eat and enjoy");
	}
	

}
