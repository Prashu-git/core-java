package com.template.app.repo;

import com.template.app.dto.SoldierDTO;

public class SoldiersRepoImpl implements SoldiersRepos {

	public SoldiersRepoImpl() {
		System.out.println("inside SoldiersRepoImpl using no-arg");

	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Inside save");
		System.out.println("Dto : " + dto);
		return false;
	}

}
