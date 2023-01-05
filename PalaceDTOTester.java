package com.lambda.app.DTOTester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import com.lambda.app.DTOClasses.PalaceDTO;

public class PalaceDTOTester {
	public static void main(String[] args) {

		Collection<PalaceDTO> elements = new ArrayList<PalaceDTO>();
		elements.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Prashanth", false, 150.00));
		elements.add(new PalaceDTO("Mysore Palace", "Mysore", "King", true, 150.00));
		elements.add(new PalaceDTO("Lila Palace", "Mysore", "Yash", false, 100.00));
		elements.add(new PalaceDTO("Tipu Sultan's Summer Palace", "Bangalore", "Tippu", false, 0.00));

		System.out.println("Creating stream ");
		elements
		.stream()		
		.filter(ele ->  ele.getName().endsWith("e"))
		.collect(Collectors.toSet())
		.forEach(ele ->	System.out.println(ele));
		
	}
}
