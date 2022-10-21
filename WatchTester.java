package com.xworkz.watch;

public class WatchTester {
	
	public static void main(String[] args) {
		
			Watch wt = new Watch(420 , "mens" , "Silver" , 59999.00 , "Rolex");
			System.out.println(wt.watchId +"\n"+ wt.brandName +"\n"+ wt.type +"\n"+ wt.price +"\n"+ wt.colour);
			System.out.println("\n");
			
			Watch wt1 = new Watch(840 , "unisex" , "silver and Brown" , 5999.00 , "Sonata");
			System.out.println(wt1.watchId +"\n"+ wt1.brandName +"\n"+ wt1.type +"\n"+ wt1.price +"\n"+ wt1.colour);
			
			
			
			
	}
}
