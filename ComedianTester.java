package com.assignment;

import com.assignment.comedian.Comedian;

public class ComedianTester {
	public static void main(String[] args) {
		Comedian comedian = new Comedian();
		comedian.toLaugh();
		
		
		Comedian comedian2 = new Comedian();
		comedian2.name = "Joker";
		comedian2.displayInfo();
	}

}
