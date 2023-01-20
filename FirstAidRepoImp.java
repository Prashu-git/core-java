package com.template.app.repo;

import org.springframework.stereotype.Component;

import com.template.app.dto.FirstAidDTO;

@Component
public class FirstAidRepoImp implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("inside save");
		return false;
	}

}
