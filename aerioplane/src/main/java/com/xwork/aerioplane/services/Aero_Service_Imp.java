package com.xwork.aerioplane.services;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwork.aerioplane.DTO.AeroplaneDTO;
import com.xwork.aerioplane.DTO.entity.AeroplaneEntityDto;
import com.xwork.aerioplane.repository.Aer_Reop;

@Service
public class Aero_Service_Imp implements Aero_Service {

	@Autowired
	private Aer_Reop aero;

	public Aero_Service_Imp() {
		System.out.println("inside Aero_Service_Imp " + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		System.out.println("running validate and save");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<AeroplaneDTO>> constraintViolations = validator.validate(dto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Vaiolataion Excist, return Vaiolation" + dto);

			return constraintViolations;

		} else {
			System.out.println("Vaiolation does not excist , Data is Successs...");

			AeroplaneEntityDto aeroplaneEntityDto = new AeroplaneEntityDto();
			aeroplaneEntityDto.setName(dto.getName());
			;
			aeroplaneEntityDto.setCountry(dto.getCountry());
			;
			aeroplaneEntityDto.setBatchNo(dto.getBatchNo());
			;
			aeroplaneEntityDto.setId(dto.getId());
			;

			boolean saved = this.aero.save(aeroplaneEntityDto);
			System.out.println("Created save:" + saved);

			return Collections.emptySet();
		}

	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntityDto aeroplaneEntityDto = this.aero.findById(id);
			if (aeroplaneEntityDto != null) {
				System.out.println("entity is found in service for id" + id);
				AeroplaneDTO vDto = new AeroplaneDTO();
				vDto.setId(aeroplaneEntityDto.getId());
				vDto.setName(aeroplaneEntityDto.getName());
				vDto.setCountry(aeroplaneEntityDto.getCountry());
				vDto.setBatchNo(aeroplaneEntityDto.getBatchNo());
				return vDto;
			}
		}

		return Aero_Service.super.findById(id);

	}
}
