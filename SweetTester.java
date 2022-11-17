package com.assignment;

import com.assignment.Sweet.Sweet;

public class SweetTester {
	public static void main(String[] args) {
		Sweet sweet = new Sweet();
		sweet.tastesGood();
		
		
		Sweet sweet2 = new Sweet();
		sweet2.name = "MysurPack";
		sweet2.displayInfo();
	}

}
