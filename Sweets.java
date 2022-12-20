package com.collections.app;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {
	public static void main(String[] args) {
		Collection collection = new ArrayList();

		collection.add("Gulab Jamun");
		collection.add("Mysore pak");
		collection.add("Halkova");
		collection.add("Kulfi");
		collection.add("Rasgulla");
		collection.add("Jalebi");
		collection.add("Kaju barfi");
		collection.add("Ras malai");
		collection.add("Laddu");
		collection.add("Champakali ");
		collection.add("Dharwad Peda");
		collection.add("Holige");
		collection.add("Badam Halva");
		collection.add("Kesari Bath");
		collection.add("Kajjaya");

		System.out.println(collection.size());
		System.out.println(collection);

		collection.clear();
		System.out.println(collection.size());

	}

}
