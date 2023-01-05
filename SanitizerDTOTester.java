package com.sanitizer.app.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.sanitizer.app.SanitizerDTO;

public class SanitizerDTOTester extends SanitizerDTO {
	public static void main(String[] args) {

		SanitizerDTO sanitizer = new SanitizerDTO(420, "Dettol", 50.00, "Green");

		SanitizerDTO sanitizer1 = new SanitizerDTO(12, "Lifebuoy", 45.00, "Red");

		SanitizerDTO sanitizer2 = new SanitizerDTO(3, "Sterillium", 80.00, "white");

		SanitizerDTO sanitizer3 = new SanitizerDTO(11, "Savlon", 65.00, "Blue");

		SanitizerDTO sanitizer4 = new SanitizerDTO(19, "Godrej", 110.00, "Yellow");

		SanitizerDTO sanitizer5 = new SanitizerDTO(6, "DCM Shriram", 60.00, "White");

		SanitizerDTO sanitizer6 = new SanitizerDTO(4, "Trust", 40.00, "Purpel");

		SanitizerDTO sanitizer7 = new SanitizerDTO(75, "Corvil ", 102.00, "White");

		SanitizerDTO sanitizer8 = new SanitizerDTO(85, "Multani", 45.00, "Brown");

		SanitizerDTO sanitizer9 = new SanitizerDTO(125, "Dabur", 30.00, "Orange");

		Collection<SanitizerDTO> element = new ArrayList<SanitizerDTO>();
		element.add(sanitizer9);
		element.add(sanitizer1);
		element.add(sanitizer2);
		element.add(sanitizer3);
		element.add(sanitizer4);
		element.add(sanitizer5);
		element.add(sanitizer6);
		element.add(sanitizer7);
		element.add(sanitizer8);
		element.add(sanitizer);

		System.out.println(element.size());

		System.out.println(element);

		for (SanitizerDTO sanitizerDTO : element) {
			System.out.println(sanitizerDTO);

		}

		System.out.println("\n");

		Iterator<SanitizerDTO> sani = element.iterator();
		while (sani.hasNext()) {
			SanitizerDTO sanitizerDTO = (SanitizerDTO) sani.next();
			if (sanitizerDTO.getPrice() > 50) {
				System.out.println(sanitizerDTO);

			}

		}

		System.out.println("\n");
		Iterator<SanitizerDTO> saniti = element.iterator();
		while (saniti.hasNext()) {
			SanitizerDTO sanitizerDTO1 = (SanitizerDTO) saniti.next();
			if (sanitizerDTO1.getColour().contains("Green")) {
				if (sanitizerDTO1.getColour().contains("Red")) {
					if (sanitizerDTO1.getColour().contains("White")) {

					}

				}
				System.out.println(sanitizerDTO1);
				saniti.remove();

				System.out.println("\n");
				System.out.println("After removing " + element.size());

			}

		}

	}

}
