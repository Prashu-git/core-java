package com.xworkz.airport;

public class Airport {
public static String company;
	public String employeeId ;
	public String name ;
	public String bloodGroup ;

	
	public Airport () {
		
	}
	
	
	public  Airport (String empId , String nm , String bgroup) {

		this.employeeId = empId;
	    this.name = nm;
		this.bloodGroup= bgroup;
	
	
	
	
	}
	
	public void toHelpTheOrg () {
		
		
		
		System.out.println("Lets work");
	}
	
	
	
}
