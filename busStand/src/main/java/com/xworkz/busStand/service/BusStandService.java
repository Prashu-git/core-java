package com.xworkz.busStand.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.busStand.dto.BusStandDTO;

public interface BusStandService {

	public Set<ConstraintViolation<BusStandDTO>> validateAndSave(BusStandDTO standDTO);

	default BusStandDTO searchById(int id) {
		return null;
	}

}
