package com.assignment;

import com.assignment.river.River;

public class RiverTester {
public static void main(String[] args) {
	River river = new River();
	river.waterFlow();
	
	
	River river2 = new River();
	river2.name = "Kaveri";
	river2.displayInfo();
}
}
