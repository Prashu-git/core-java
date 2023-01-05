package com.lambda.app.DTOTester;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.lambda.app.DTOClasses.ApplicationDTO;

public class ApplicationTesterDTO {
	public static void main(String[] args) {
		Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("WhatsApp", 14.3, "Meta", 0));
		applicationDTOs.add(new ApplicationDTO("Gmail", 18.8, "Google", 10));
		applicationDTOs.add(new ApplicationDTO("Google Cloud", 1.3, "Google", 12));
		applicationDTOs.add(new ApplicationDTO("Chrome", 14.3, "Google", 0));
		applicationDTOs.add(new ApplicationDTO("RedBus", 1.8, "Beta", 140));

		applicationDTOs.stream().filter(ele -> ele.getDevelopedBy().contains("Google")).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

	}

}
