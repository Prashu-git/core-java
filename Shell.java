package com.fuel.app.dependency.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fuel.app.dependency.bean.Fuel;
import com.fuel.app.dependency.bean.PetrolBunk;

@Component
public class Shell implements PetrolBunk {

	public Shell() {
		System.out.println("inside shell()");

	}

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;

	@Override
	public void purchase() {
		System.out.println("inside purchase()");

	}

}
