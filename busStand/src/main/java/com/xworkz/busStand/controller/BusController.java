package com.xworkz.busStand.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.busStand.dto.BusStandDTO;
import com.xworkz.busStand.service.BusStandService;

@Controller
@RequestMapping("/")
public class BusController {
	public BusController() {
		System.out.println("inside BusController " + getClass().getSimpleName());
	}

	@Autowired
	public BusStandService busStandService;

	@GetMapping("/bus_Stand")
	public String onBusStand(Model model) {
		System.out.println("inside onBusStand ");
		return "busStand";
	}

	@PostMapping("/bus_Stand")
	public String onBusStand(BusStandDTO dto, Model model) {
		System.out.println("running onBusStand post method" + dto);
		Set<ConstraintViolation<BusStandDTO>> violations = busStandService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			return "success";
		} else {
			
			  violations.forEach(e -> { System.out.println(e.getMessage());});
			 

			/*
			 * model.addAttribute("bus_No", busNumber); model.addAttribute("depo", depo);
			 * model.addAttribute("main_Stop", main_Stop); model.addAttribute("last_Stop",
			 * last_Stop);
			 */

			model.addAttribute("error", violations);
			model.addAttribute("BusStandDTO", dto);
			System.err.println("violation is controller");
			return "busStand";
		}
	}

	@GetMapping("/searchbyId")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		BusStandDTO busStandDTO = this.busStandService.searchById(id);
		if (busStandDTO != null) {model.addAttribute("dto", busStandDTO);

		} else {
			model.addAttribute("message", "do not found");
		}
		return "search";

	}
}
