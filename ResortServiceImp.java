package com.template.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.template.app.dto.ResortDTO;
import com.template.app.repo.ResortRepo;

public class ResortServiceImp {
	@Component
	public class ResortServiceImpli implements ResortService {

		@Autowired
		private Validator validate;
		@Autowired
		private ResortRepo resort;

		@Autowired
		public ResortServiceImpli(ResortRepo resort) {
			System.out.println("running ResortServiceImpli" + resort);
			this.resort = resort;
		}

		@Override
		public boolean validateAndSave(ResortDTO dto) {
			Set<ConstraintViolation<ResortDTO>> violations = this.validate.validate(dto);
			if (!violations.isEmpty()) {
				System.err.println("invalid datas in dto");
				violations.forEach(e -> System.out.println(e.getMessage()));
				return false;
			} else {
				System.out.println("no errors are in dto");
				boolean save = this.resort.save(dto);
				System.out.println("saving" + save);
				return save;
			}

		}

	}

}
