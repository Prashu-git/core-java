package com.fuel.app.dependency.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fuel.app.dependency.bean.Browser;
import com.fuel.app.dependency.bean.Provider;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	@Override
	public void browser() {
		System.out.println("inside browser()");
		
		provider.conect();
	}

}
