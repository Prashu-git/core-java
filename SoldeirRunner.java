package com.template.app.boot;

import com.template.app.dto.SoldierDTO;
import com.template.app.repo.SoldiersRepoImpl;
import com.template.app.service.SoldierServiceImpl;

public class SoldeirRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Shashi", 420, "India", "Lasts", "Sweeper");

		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldiersRepoImpl repository = new SoldiersRepoImpl();
		service.setRepository(repository);

		service.validateAndSave(dto);
	}

}
