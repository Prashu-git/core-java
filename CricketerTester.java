package com.assignment;

import com.assignment.cricketer.Cricketer;

public class CricketerTester {
	public static void main(String[] args) {
		Cricketer cricketer = new Cricketer();
		cricketer.toScore();
		
		
		Cricketer cricketer2 = new Cricketer();
		cricketer2.name = "Virat";
		cricketer2.displayInfo();
	
	}

}
