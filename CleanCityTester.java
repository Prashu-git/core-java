package com.assignment;

import com.assignment.cleanCity.CleanCity;

public class CleanCityTester {
	public static void main(String[] args) {
		CleanCity city = new CleanCity();
		city.city();
		
		CleanCity city2 = new CleanCity();
		city2.name = "Mysoru";
		city2.displayInfo();
	}

}
