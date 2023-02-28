package com.xworkz.busStand.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.busStand.dto.BusStandDTO;
import com.xworkz.busStand.dto.entity.BusStandEntityDTO;
import com.xworkz.busStand.repository.BusStandRepository;

@Service("busStandService")
public class BusStandServiceImp implements BusStandService {

	public BusStandServiceImp() {
		System.out.println("inside BusStandServiceImp " + getClass().getSimpleName());
	}

	@Autowired
	private BusStandRepository standRepository;

	@Override
	public Set<ConstraintViolation<BusStandDTO>> validateAndSave(BusStandDTO standDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<BusStandDTO>> constraintViolations = validator.validate(standDTO);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Vaiolataion Excist, return Vaiolation" + standDTO);

			return constraintViolations;

		} else {
			System.out.println("Vaiolation does not excist , Data is Successs...");

			BusStandEntityDTO busStandEntityDTO = new BusStandEntityDTO();
			busStandEntityDTO.setId(standDTO.getId());
			;
			busStandEntityDTO.setBus_No(standDTO.getBus_No());
			;
			busStandEntityDTO.setDepo(standDTO.getDepo());
			;
			busStandEntityDTO.setMain_Stop(standDTO.getMain_Stop());
			;
			busStandEntityDTO.setLast_Stop(standDTO.getLast_Stop());
			;

			boolean saved = this.standRepository.save(busStandEntityDTO);
			System.out.println("Created save:" + saved);

			return Collections.emptySet();
		}
	}

	@Override
	public BusStandDTO searchById(int id) {

		if (id > 0) {
			BusStandEntityDTO busStandEntityDTO = this.standRepository.searchById(id);
			if (busStandEntityDTO != null) {
				System.out.println("entity is found in service for id" + id);
				BusStandDTO busStandDTO = new BusStandDTO();
				busStandDTO.setId(busStandEntityDTO.getId());
				busStandDTO.setBus_No(busStandEntityDTO.getBus_No());
				busStandDTO.setDepo(busStandEntityDTO.getDepo());
				busStandDTO.setMain_Stop(busStandEntityDTO.getMain_Stop());
				busStandDTO.setLast_Stop(busStandEntityDTO.getLast_Stop());
				return busStandDTO;
			}
		}

		return BusStandService.super.searchById(id);
	}

}
