package com.springValue.app.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("PSLV3")
	private String name;
	@Value("India")
	private String country;
	@Value("6589635.02d")
	private Double price;

	public Rocket() {
		System.out.println("inside ValuesSpring()");

	}

	@Bean
	public String getCountry() {
		return country;
	}

	@Bean
	public Double getPrice() {
		return price;
	}

	@Bean
	public String getName() {
		return name;
	}

}
