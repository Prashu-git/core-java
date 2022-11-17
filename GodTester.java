package com.assignment;

import com.assignment.God.God;

public class GodTester {
	public static void main(String[] args) {
		God god = new God();
		god.superme();
		
		God god2 = new God();
		god2.name = "Shiva";
		god2.displayInfo();
	}

}
