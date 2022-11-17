package com.assignment;

import com.assignment.human.Human;

public class HumanTester {
	public static void main(String[] args) {
		Human human =   new Human();
		human.socialHuman();
		
		
		Human human2 = new Human();
		human2.name = "Shashi";
		human2.displayInfo();
	}

}
