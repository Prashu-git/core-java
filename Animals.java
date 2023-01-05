package app.forEachIterator.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {

	public static void main(String[] args) {

		String animal1 = "Lion";
		String animal2 = "Tiger";
		String animal3 = "Horse";
		String animal4 = "Elephant";
		String animal5 = "Dog";

		Collection<String> animal = new ArrayList<String>();
		animal.add(animal5);
		animal.add(animal1);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);

		System.out.println("The size of the collector are " + animal.size());
		System.out.println("\n");

		System.out.println("Using for each loop");

		for (String elements : animal) {

			System.out.println(elements);
			// System.out.println("\n");

		}

		System.out.println("\n");

		System.out.println("Using Iterator method");

		Iterator<String> element = animal.iterator();

		while (element.hasNext()) {
			String string = (String) element.next();
			System.out.println(string);

		}

	}
}
