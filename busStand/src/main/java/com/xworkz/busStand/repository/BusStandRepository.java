package com.xworkz.busStand.repository;

import com.xworkz.busStand.dto.entity.BusStandEntityDTO;

public interface BusStandRepository {

	public boolean save(BusStandEntityDTO entityDTO);

	default BusStandEntityDTO searchById(int id) {
		return null;
	}

}
