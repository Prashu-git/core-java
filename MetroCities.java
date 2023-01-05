package app.forEachIterator.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCities {

	public static void main(String[] args) {
		String name1 = "Bangalore";
		String name2 = "Mumbai";
		String name3 = "Kolkata";
		String name4 = "Hyderabad";
		String name5 = "Chennai";

		Collection<String> citie = new ArrayList<String>();
		citie.add(name5);
		citie.add(name1);
		citie.add(name3);
		citie.add(name2);
		citie.add(name4);

		System.out.println("Using foreach loop");

		for (String city : citie) {

			System.out.println(city);
		}

		System.out.println("\n");
		System.out.println("Using Iterator method");
		Iterator<String> iterator = citie.iterator();

		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}

	}

}
