package com.assignment;

import com.assignment.petrolBunk.PetrolBunk;

public class PetrolBunkTester {
	public static void main(String[] args) {
		PetrolBunk petrolBunk = new PetrolBunk();
		petrolBunk.toFillVehicals();
		
		
		
		PetrolBunk petrolBunk2 = new PetrolBunk();
		petrolBunk2.name = "HP";
		petrolBunk2.displayInfo();
	}

}
