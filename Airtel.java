package com.fuel.app.dependency.implementation;

import org.springframework.stereotype.Component;

import com.fuel.app.dependency.bean.Provider;
@Component
public class Airtel implements Provider {

	@Override
	public void conect() {
		System.out.println("inside conect");
	}

}
