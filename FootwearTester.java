package com.xworkz.footwear;

public class FootwearTester {

	
	public static void main(String[] args) {
		Footwear fw = new Footwear("FD0025", "7 UK" , "Black" , "LU2017" , "Lunars Walkmate");
		System.out.println(fw.id +"\n" + fw.brandName +"\n"+ fw.colour +"\n"+ fw.model + "\n" + fw.size);		
		System.out.println("\n");
		Footwear fw1 = new Footwear("FD576", "8 UK" , "Brown" , "LU878937" , "Puma");		
		System.out.println(fw1.id +"\n" + fw1.brandName +"\n"+ fw1.colour +"\n"+ fw1.model + "\n" + fw1.size);		
		System.out.println("\n");		
		Footwear fw2 = new Footwear("FD566", "9 UK" , "Brown and Black" , "A45545" , "Adidas");		
		System.out.println(fw2.id +"\n" + fw2.brandName +"\n"+ fw2.colour +"\n"+ fw2.model + "\n" + fw2.size);
		
			
		
	}
	
}
