package com.searchengine.app;

public class SearchEngine {
	
	public String name;
	public String netWorth;
	
	
	public void toSearchInfo(String name) {
		
		this.name = name;
		
	}
	
	public void displayInfo() {
		System.out.println("The name of the search engine is" +" "+ this.name);
		
		
		
	}
	

}
