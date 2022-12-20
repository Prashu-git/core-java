package com.collections.app;

import java.util.ArrayList;
import java.util.Collection;

public class Bikes {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		
		collection.add("Kawasaki Ninja H2R");
		collection.add("Energica Ego 45 Limited Editon");
		collection.add("Vyrus 987 C3 4V");
		collection.add("MV Agusta F4CC");
		collection.add("NCR MH TT");
		collection.add("Neiman Marcus Limited Edition Fighter");
		collection.add("Ecosse ES1 Spirit");
		collection.add("The Yamaha BMS Chopper");
		collection.add("Harley Davidson Cosmic Starship");
		collection.add("Dodge Tomahawk V10 Superbike");
		collection.add("Legendary British Vintage Black");
		collection.add("Ecosse Founder’s Edition Ti XX ");
		collection.add("Ducati Desmosedici D16RR NCR M16");
		collection.add("Suzuki AEM Carbon Fiber Hayabusa");
		collection.add("Honda RC213 V-S ");
		collection.add("MTT Turbine Streetfighter");
		collection.add("Icon Sheene");
		collection.add("NCR Leggera 1200 Titanium Special ");
		collection.add("BMW S 1000 RR");
		collection.add("Splendor");
		
		
		System.out.println(collection);
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println(collection.size());


	}

}
