package com.assignment;

import com.assignment.city.City;

public class CityTester {

	public static void main(String[] args) {
		City city = new City();
		city.cityToBe();
		
		
		City city2 = new City();
		city2.name = "Chamrajnagar";
		city2.displayInfo();
	}
}
