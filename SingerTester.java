package com.assignment;

import com.assignment.singer.Singer;

public class SingerTester {
	public static void main(String[] args) {
		Singer singer = new Singer();
		singer.toSingSong();
		
		Singer singer2 = new Singer();
		singer2.name = "Shashi";
		singer2.displayInfo();
	}

}
