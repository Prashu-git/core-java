package app.forEachIterator.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		String name2 = "Wipro";
		String name1 = "Infosys";
		String name3 = "Accenture";
		String name4 = "TCS";
		String name5 = "IBM";
		String name6 = "Oracle";
		String name7 = "Cognizant";
		String name8 = "Capgemini";
		String name9 = "Cisco";
		String name10 = "Mindtree";
		String name11 = "HCL";
		String name12 = "Mu Sigma";
		String name13 = "Amazon";
		String name14 = "Dell";
		String name15 = "HP";
		String name16 = "Tech Mahindra";
		String name17 = "SAP";
		String name18 = "Samsung R&D";
		String name19 = "Robert Bosch";
		String name20 = "Thomson Reuters";

		Collection<String> collection = new ArrayList<String>();
		collection.add(name20);
		collection.add(name1);
		collection.add(name2);
		collection.add(name3);
		collection.add(name4);
		collection.add(name5);
		collection.add(name6);
		collection.add(name7);
		collection.add(name8);
		collection.add(name9);
		collection.add(name10);
		collection.add(name11);
		collection.add(name12);
		collection.add(name13);
		collection.add(name14);
		collection.add(name15);
		collection.add(name16);
		collection.add(name17);
		collection.add(name18);
		collection.add(name19);

		System.out.println("The size of is :" + collection.size());

		System.out.println("\n");

		System.out.println("Using foreach loop");
		for (String string : collection) {

			System.out.println(string);
		}

		System.out.println("\n");
		System.out.println("Using Iterator method");
		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}

	}

}
