package com.assignment;

import com.assignment.biscuit.Biscuit;

public class BiscuitTester {
	public static void main(String[] args) {
		Biscuit biscuit = new Biscuit();
		biscuit.tastsGood();

		Biscuit biscuit2 = new Biscuit();
		biscuit2.name = " Dark Fantasy";
		biscuit2.displayInfo();
	}

}
