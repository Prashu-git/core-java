package com.fuel.app.dependency.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fuel.app")
public class BrowserConfigureation {

	public BrowserConfigureation() {
		System.out.println("inside BrowserConfigureation() ");
	}
}
