package com.xworkz.softdrinks;

public class SoftDrinksTester {
	public static void main(String[] args) {
		

		SoftDrinks sd = new SoftDrinks(644 , "Coca-Cola" ,50.00 , "Cola" , "1000ml");
		System.out.println(sd.name +"\n"+ sd.flavor +"\n"+ sd.id +"\n"+ sd.price +"\n"+ sd.quantity);
		System.out.println("\n");
		
		
		SoftDrinks sd1 = new SoftDrinks(5554 , "Pepsi" ,45.00 , "Fruit" , "1000ml");
		System.out.println(sd1.name +"\n"+ sd1.flavor +"\n"+ sd1.id +"\n"+ sd1.price +"\n"+ sd1.quantity);
		System.out.println("\n");
		
		
		SoftDrinks sd2 = new SoftDrinks(840 , "7 up" , 40.00 , "Cherry" , "1000ml");
		System.out.println(sd2.name +"\n"+ sd2.flavor +"\n"+ sd2.id +"\n"+ sd2.price +"\n"+ sd2.quantity);
		
		
		
		
	}
	
	
	
	
	
	

}
