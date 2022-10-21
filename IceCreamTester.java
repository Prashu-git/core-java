package com.xworkz.icecream;

public class IceCreamTester {
	public static void main(String[] args) {
		IceCream ic = new IceCream("Kulfi" , 5.00);
		System.out.println(ic.name +"\n"+ ic.price);
		System.out.println("\n");
		
		
		IceCream ic1 = new IceCream("Choc Bar" , 10.00);
		System.out.println(ic1.name +"\n"+ ic1.price);
		System.out.println("\n");
		
	}

}
