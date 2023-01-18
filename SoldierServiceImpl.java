package com.template.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.template.app.dto.SoldierDTO;
import com.template.app.repo.SoldiersRepos;

public class SoldierServiceImpl implements SoldiersService {

	private SoldiersRepos repos;

	public SoldierServiceImpl() {
		System.out.println("inside SoldierServiceImpl");
	}

	public void setRepository(SoldiersRepos repos) {
		this.repos = repos;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		// TODO Auto-generated method stub

		System.out.println("starting validateAndSave..");
		System.out.println("dto passed : " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error as occured");

			violations.forEach(c -> {
				System.out.println("Violating message " + c.getMessage());
			});
			return false;
			
		} else {
			System.out.println("Data is correct");
			boolean saved = repos.save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}
	}

}
