package com.xwork.aerioplane.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xwork.aerioplane.DTO.AeroplaneDTO;

public interface Aero_Service {

 public	Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto);

 default	AeroplaneDTO findById(int id) {
	 return null;
 }

}
	