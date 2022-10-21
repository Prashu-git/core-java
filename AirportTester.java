package com.xworkz.airport;

public class AirportTester {
	
	public static void main (String [] args) {
		Airport.company = "Amazon";
		Airport at = new Airport ("AWS420" , "Amar" , "OB-ve") ;
		
		System.out.println(at.employeeId + " \n " + at.name + " \n " + at.bloodGroup + " \n " + Airport.company);
		System.out.println("\n");
		//Airport.company = "Amazon";
		Airport at1 = new Airport ("AWS840" , "Akbar" , "O-ve") ;
			System.out.println(at1.employeeId + " \n " + at1.name + " \n " + at1.bloodGroup + " \n " + Airport.company);
			System.out.println("\n");

			Airport at2 = new Airport ("AWS1200" , "Antony" , "a-ve") ;
			System.out.println(at2.employeeId + " \n " + at2.name + " \n " + at2.bloodGroup + " \n " + Airport.company);

			System.out.println("\n");

			Airport at3 = new Airport ("AWS149" , "Birbal" , "b-ve") ;
			System.out.println(at3.employeeId + " \n " + at3.name + " \n " + at3.bloodGroup + " \n " + Airport.company);

}
}









