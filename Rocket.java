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

	public String getCountry() {
		return country;
	}

	public Double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}
