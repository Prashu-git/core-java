package com.assignment;

import com.assignment.smartCity.SmartCity;

public class SmartCityTester {
	public static void main(String[] args) {
		SmartCity smartCity = new SmartCity();
		smartCity.smart();
		
		
		SmartCity smartCity2 = new SmartCity();
		smartCity2.name = "Shimoga";
		smartCity2.displayInfo();
	}

}
