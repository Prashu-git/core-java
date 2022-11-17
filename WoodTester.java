package com.assignment;

import com.assignment.wood.Wood;

public class WoodTester {
	public static void main(String[] args) {
		Wood wood = new Wood();
		wood.goodInterior();

		Wood wood2 = new Wood();
		wood2.woodMaterial = "Door";
		wood2.displayInfo();
	}
}
