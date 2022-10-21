package com.xworkz.softdrinks;

public class SoftDrinks {

	int id ;
	String name;
	double price ;
	String flavor;
	String quantity ;
	
	public SoftDrinks () {
		
	}
	
	public SoftDrinks (int i , String na , double rate , String fa, String ml) {
		
		this.id =i;
		this.name = na;
		this.price = rate;
		this.flavor = fa;
		this.quantity = ml;
		
	}
	
	public void toGetEnergy () {
		System.out.println("Lets drink and enjoy");
		
		
	}
	
}
