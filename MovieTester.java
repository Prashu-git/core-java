package com.assignment;

import com.assignment.movie.Movie;

public class MovieTester {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.toWatch();
		
		
		Movie movie2= new Movie();
		movie2.name = "Jackie";
		movie2.displayInfo();
	}

}
