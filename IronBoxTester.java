package com.xworkz.ironbox;

public class IronBoxTester {
	
	public static void main(String[] args) {
		IronBox ib = new IronBox(524, "Phillips" , 8595.00);
		System.out.println(ib.ironId +"\n"+ ib.name +"\n"+ ib.price);
		System.out.println("\n");
		
		
		IronBox ib1 = new IronBox(1200, "Havells" , 6999.00);
		System.out.println(ib1.ironId +"\n"+ ib1.name +"\n"+ ib1.price);

	}

}
