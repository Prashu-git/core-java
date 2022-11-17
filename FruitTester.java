package com.assignment;

import com.assignment.app.Fruit;

public class FruitTester {
public static void main(String[] args) {
	Fruit fruit = new Fruit();
	fruit.toTastSweet();
	
	Fruit fr = new Fruit();
	fr.name = "Mango";
	fr.displayInfo();
}
}
