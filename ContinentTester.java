package com.assignment;


import com.assignment.continent.Continent;

public class ContinentTester {
	public static void main(String[] args) {
		
		Continent continent = new Continent();
		continent.landPart();
		
		
		Continent continent2 = new Continent();
		continent2.name = "Asia";
		continent2.displayInfo();
		
	}
	}


