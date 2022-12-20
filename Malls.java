package com.collections.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Malls {

	public static void main(String[] args) {

		/*
		 * Collection collection1 = new TreeSet(); Collection collection2 = new
		 * HashSet();
		 */

		Collection collection = new ArrayList();
		collection.add("UB City");
		collection.add("Phoenix Market City");
		collection.add("Mantri Square");
		collection.add("Orion");
		collection.add("Gopalan");
		collection.add("Bangalore Central");
		collection.add("Garuda");
		collection.add("Inorbit");
		collection.add("Leela Galleria");
		collection.add("Cosmos");
		collection.add("Total Mall");
		collection.add("Park Square");
		collection.add("Royal Meenakshi");
		collection.add("Gopalan Mall");
		collection.add("Lulu ");
		collection.add("Nexus");
		collection.add("City Centre");
		collection.add("Lotus");
		collection.add("VR Bengaluru");
		collection.add("Urban Oasis");
		collection.add("Mall of Mysore");
		collection.add("Elements Mall");
		collection.add("Prashanth");
		collection.add("DT City Centre");
		collection.add("Metro Walk");
		collection.add("Unity One");
		collection.add("Rockline");
		collection.add("Vaishnavi Sapphire");
		collection.add("Vishal Mega Mart");
		collection.add("Om Collections");
		collection.add("DLF Mall of India");
		collection.add("NeoMall Electronic City");
		collection.add("Forum Falcon City");
		collection.add("Gardens Galleria");
		collection.add("Top Mall");
		collection.add("Trends");
		collection.add("Golden Heights");
		collection.add("Esteem Mall");
		collection.add("Lido Mall");
		collection.add("ETA Namma");

		System.out.println(collection.size());
		System.out.println(collection);

		collection.clear();
		System.out.println(collection.size());

	}

}
