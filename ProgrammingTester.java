package com.assignment;

import com.assignment.programming.Programming;

public class ProgrammingTester {
	public static void main(String[] args) {
		Programming programming = new Programming();
		programming.langToCode();
		
		Programming programming2 = new Programming();
		programming2.name = "Java";
		programming2.displayInfo();
	}

}
