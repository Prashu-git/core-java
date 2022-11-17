package com.engineering;

import com.engineering.app.Engineering;

public class CivilEngineering extends Engineering{
	public static void main(String[] args) {
		
		Engineering  eng = new Engineering();
		eng.universityName = "Visvesvaraya Technological University";
		eng.displayInfo(eng);
				System.out.println("The name of the university is " + " "+ eng.universityName);
	}
	}



