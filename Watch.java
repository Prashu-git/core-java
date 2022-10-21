package com.xworkz.watch;

public class Watch {
	
	
	public int watchId ;
	public String colour ;
	public String type ; 
	public String brandName ;
public double price ;


 public Watch() {
	// TODO Auto-generated constructor stub
}
 
 
public Watch (int wId , String ty , String cl , Double rate , String bn) {
	

watchId = wId;
colour = cl;
type = ty;
brandName = bn;
price = rate ;
	
	
}
	public void toSeeTime () {
		System.out.println("Whatz the time");
		
	}

}
