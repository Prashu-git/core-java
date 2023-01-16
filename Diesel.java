package com.fuel.app.dependency.implementation;

import org.springframework.stereotype.Component;

import com.fuel.app.dependency.bean.Fuel;

@Component
public class Diesel implements Fuel {

	@Override
	public void consume() {
		System.out.println("inside diesel consume()");
	}

}
