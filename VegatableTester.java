package com.assignment;

import com.assignment.Vegatable.Vegatable;

public class VegatableTester {
	public static void main(String[] args) {
		Vegatable vegatable = new Vegatable();
		vegatable.healthy();

		Vegatable vegatable2 = new Vegatable();
		vegatable2.name = "Onion";
		vegatable2.displayInfo();
	}

}
