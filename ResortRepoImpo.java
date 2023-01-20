package com.template.app.repo;

import org.springframework.stereotype.Component;

import com.template.app.dto.ResortDTO;

@Component
public class ResortRepoImpo implements ResortRepo {

	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("inside save()");
		return false;
	}

}
