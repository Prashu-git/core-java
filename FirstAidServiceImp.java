package com.template.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.template.app.dto.FirstAidDTO;
import com.template.app.repo.FirstAidRepo;

@Component
public class FirstAidServiceImp implements FirstAidService {

	
	private FirstAidRepo firstAidRepo;
	private Validator validator;

	
	public FirstAidServiceImp(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setFirstAidRepositery(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {

		System.out.println("inside validateAndSave");
		System.out.println("aidDTO  : " + aidDTO);

		// ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		// Validator validator = factory.getValidator();
		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(aidDTO);

		if (!violations.isEmpty()) {
			System.err.println("error in validation");
			violations.forEach(b -> System.err.println(b.getMessage()));
			return false;
		} else {
			System.out.println("there is no error ");
			boolean saved = firstAidRepo.save(aidDTO);
			System.out.println("data saved" + saved);
			return true;
		}

	}

}
