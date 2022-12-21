package app.forEachIterator.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {
	public static void main(String[] args) {

		String watch1 = "Rolex";
		String watch2 = "Harry Winston";
		String watch3 = "Patek Philippe";
		String watch4 = "Fastrack";
		String watch5 = "HMT";

		Collection<String> collection = new ArrayList<String>();
		collection.add(watch5);
		collection.add(watch2);
		collection.add(watch4);
		collection.add(watch1);
		collection.add(watch3);

		System.out.println("The size of the collector are " + collection.size());

		System.out.println("\n");
		System.out.println(collection);
		System.out.println("\n");

		// foreach
		System.out.println("Using for each loop");
		for (String elements : collection) {
			System.out.println(elements);

		}

		System.out.println("\n");

		System.out.println("Using while loop");

		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {
			String string = iterator.next();

			System.out.println(string);

		}

	}

}
