package com.xwork.aerioplane.repository;

import com.xwork.aerioplane.DTO.entity.AeroplaneEntityDto;

public interface Aer_Reop {

	public boolean save(AeroplaneEntityDto aeroplaneEntityDto);

	default AeroplaneEntityDto findById(int id) {

		return null;
	}

}
