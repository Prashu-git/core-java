package app.forEachIterator.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {

		float size1 = 3;
		float size2 = 3.5F;
		float size3 = 4;
		float size4 = 4.5F;
		float size5 = 5;
		float size6 = 5.5F;
		float size7 = 6;
		float size8 = 6.5F;
		float size9 = 7;
		float size10 = 7.5F;
		float size11 = 8;
		float size12 = 8.5F;
		float size13 = 9;
		float size14 = 9.5F;
		float size15 = 10;

		Collection<Float> elemnts = new ArrayList<Float>();
		elemnts.add(size1);
		elemnts.add(size2);
		elemnts.add(size3);
		elemnts.add(size4);
		elemnts.add(size5);
		elemnts.add(size6);
		elemnts.add(size7);
		elemnts.add(size8);
		elemnts.add(size9);
		elemnts.add(size10);
		elemnts.add(size11);
		elemnts.add(size12);
		elemnts.add(size13);
		elemnts.add(size14);
		elemnts.add(size15);

		System.out.println("The size of the collection are " + elemnts.size());
		System.out.println("\n");

		System.out.println("Using foreach loop");
		for (Float float1 : elemnts) {
			System.out.println(float1);

		}

		System.out.println("\n");

		System.out.println("using Iterator method");

		Iterator<Float> element = elemnts.iterator();

		while (element.hasNext()) {

			Float fl = element.next();
			System.out.println(fl);
		}
	}

}
