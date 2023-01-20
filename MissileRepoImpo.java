package com.template.app.repo;

import org.springframework.stereotype.Component;

import com.template.app.dto.MissileDTO;

@Component
public class MissileRepoImpo implements MissileRepo {

	@Override
	public boolean save(MissileDTO mDto) {
		System.out.println("inside save()");
		return false;
	}

}
