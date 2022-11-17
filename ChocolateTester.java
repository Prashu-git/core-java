package com.assignment;

import com.assignment.chocolate.Chocolate;

public class ChocolateTester {
	public static void main(String[] args) {
		Chocolate chocolate = new Chocolate();
		chocolate.tastesSweet();

		Chocolate chocolate2 = new Chocolate();
		chocolate2.name = "DairyMilk";
		chocolate2.displayInfo();
	}

}
