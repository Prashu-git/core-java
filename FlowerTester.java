package com.assignment;

import com.assignment.flower.Flower;

public class FlowerTester {
	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.looksGood();
		
		
		Flower flower2 = new Flower();
		flower2.name = "Lotus";
		flower2.disInfo();
	}

}
