package com.collections.app;

import java.util.ArrayList;
import java.util.Collection;

public class Currencies {
	public static void main(String[] args) {

		Collection collection = new ArrayList();
		collection.add("Rupees");
		collection.add("Dollar");
		collection.add("Swiss Franc");
		collection.add("British Pound");
		collection.add("Kuwaiti Dinar");
		collection.add("Pound sterling");
		collection.add("Saudi Riyal");
		collection.add("Euro");
		collection.add("Malaysian Ringgit");
		collection.add("Danish Krone");
		collection.add("Dinar");
		collection.add("New Zealand Dollar");
		collection.add("Australian Dollar");
		collection.add("Jordanian Dinar");
		collection.add("Omani Rial");
		collection.add("Bahraini Dinar");
		collection.add("Colombian Peso");
		collection.add("Mexican Peso");
		collection.add("Hungarian Forint");
		collection.add("Turkish lira");
		collection.add("Brazilian Real");
		collection.add("Libyan Dinar");
		collection.add("Russian Ruble");
		collection.add("Japanese Yen");
		collection.add("Philippine peso");
		collection.add("South African Rand");
		collection.add("Israeli Shekel");
		collection.add("Romanian Leu");
		collection.add("New Taiwan dollar");
		collection.add("Polish Zloty");
		collection.add("Euro");

		System.out.println(collection.size());
		System.out.println(collection);

		collection.clear();
		System.out.println(collection.size());

	}

}
