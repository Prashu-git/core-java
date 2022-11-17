package com.assignment;

import com.assignment.organ.Organ;

public class OrganTester {
	public static void main(String[] args) {
		Organ organ = new Organ();
		organ.makesLifeEasyer();
		
		Organ organ2 = new Organ();
		organ2.name = "Brain";
		organ2.displayInfo();
	}

}
