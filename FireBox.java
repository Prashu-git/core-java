package com.fuel.app.dependency.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fuel.app.dependency.bean.Browser;

@Component
public class FireBox implements Browser {

	@Autowired
	@Qualifier("airtel")
	private Airtel airtel;

	@Override
	public void browser() {
		System.out.println("inside fireBox browser()");
		airtel.conect();
	}

}
