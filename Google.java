package com.searchengine;

import com.searchengine.app.SearchEngine;

public class Google extends SearchEngine {
	
	public static void main(String[] args) {
		SearchEngine se = new SearchEngine();
		se.name = "Google";
		se.displayInfo();
		
		SearchEngine se2 = new SearchEngine();
		se2.netWorth = "1135 billion USD";
		System.out.println("Its one most popular and most used search engine");
	}
	
	

}
