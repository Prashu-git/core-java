package com.assignment;

import java.awt.Color;

import com.assignment.colour.Colour;

public class ColourTester {
	public static void main(String[] args) {
		Colour colour = new Colour();
		colour.colourfull();
		
		
		Colour colour2 = new Colour();
		colour2.name = "Yellow";
		colour2.displayInfo();
	}

}
