package com.assignment;

import com.assignment.amusementPark.AmusementPark;

public class AmusementParkTester {
	public static void main(String[] args) {
		AmusementPark amusementPark = new AmusementPark();
		amusementPark.enjoyment();
		
		
		AmusementPark amusementPark2 = new AmusementPark();
		
		amusementPark2.name = "Wonderla";
		amusementPark2.displayInfo();
	}

}
