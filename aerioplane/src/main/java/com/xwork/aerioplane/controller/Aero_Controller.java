package com.xwork.aerioplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xwork.aerioplane.DTO.AeroplaneDTO;
import com.xwork.aerioplane.repository.Aer_Reop;
import com.xwork.aerioplane.services.Aero_Service;

@Controller
@RequestMapping("/")
public class Aero_Controller {

	public Aero_Controller() {
		System.out.println("inside Aero_Controller " + getClass().getSimpleName());
	}

	@Autowired
	private Aero_Service aero_Service;


	private List<String> country = Arrays.asList("India", "USA", "Germany", "North Korea", "Rome");
	private List<String> batchNo = Arrays.asList("1981", "1990", "1999", "2000", "2004", "2015", "2020");

	@GetMapping("/aero")
	public String onAeroplane(Model model) {
		System.out.println("running onAeroplane get method");
		model.addAttribute("country", country);
		model.addAttribute("batchNo", batchNo);

		return "aeroplane";
	}

	@PostMapping("/aero")
	public String onAeroplane(AeroplaneDTO dto, Model model) {

		System.out.println("running onAeroplane post method" + dto);

		Set<ConstraintViolation<AeroplaneDTO>> violations = aero_Service.validateAndSave(dto);

		if (violations.isEmpty()) {

			System.out.println("no violation in controller go to success page");

			return "aeroplane";
		} else {
			violations.forEach(e->{System.out.println(e.getMessage());});

			model.addAttribute("country", country);
			model.addAttribute("batchNo", batchNo);
			model.addAttribute("error", violations);
			model.addAttribute("AeroplaneDTO", dto);
			System.err.println("violation is controller");
			return "success";
		}
	}

	@GetMapping("/searchbyId")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		AeroplaneDTO aeroplaneDTO = this.aero_Service.findById(id);
		if (aeroplaneDTO != null) {
			model.addAttribute("dto", aeroplaneDTO);

		} else {
			model.addAttribute("message", "do not found");
		}
		return "search";
	}

}
