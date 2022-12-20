package com.collections.app;

import java.util.ArrayList;
import java.util.Collection;

public class Coupouns {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("NEW50");
		collection.add("NEW150");
		collection.add("NEW250");
		collection.add("NEW350");
		collection.add("NEW450");
		collection.add("NEW550");
		collection.add("NEW650");
		collection.add("NEW750");
		collection.add("NEW850");
		collection.add("NEW950");
		collection.add("NEW100");
		collection.add("NEW200");
		collection.add("NEW300");
		collection.add("NEW400");
		collection.add("NEW500");
		collection.add("NEW600");

		System.out.println(collection.size());
		System.out.println(collection);

		collection.clear();

		System.out.println(collection.size());

	}

}
