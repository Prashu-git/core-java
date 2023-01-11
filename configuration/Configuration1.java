package com.autowireds.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autowireds.app")
public class Configuration1 {

	public Configuration1() {
		System.out.println("inside Configuration1() ");
	}

	@Bean
	public int id() {

		System.out.println("Reg id");
		return 48;
	}

	@Bean
	public int gstNo() {

		System.out.println("Reg gstNo");
		return 458961;
	}

	@Bean
	public String HarwareShopName() {
		System.out.println("inside HarwareShopName()");
		String string = new String("Shiva Stores");
		return string;

	}

	@Bean
	public String ownerName() {
		System.out.println("inside ownerName() ");
		String string = new String("Arun");
		return string;
	}

	@Bean
	public String engineerName() {

		return "James";
	}

	@Bean
	public double salary() {

		return 800000.00;
	}

	@Bean
	public int experiance() {
		return 8;
	}

	@Bean
	public String companyName() {

		return "TCS";
	}

	@Bean
	public String pencilName() {

		return "Apsara";
	}

	@Bean
	public double money() {

		return 50.00;
	}

	@Bean
	public String madeOf() {

		return "wood";
	}

	@Bean
	public String pencilColour() {

		return "yellow";
	}

	@Bean
	public boolean isStolen() {

		return true;
	}

	@Bean
	public String shape() {

		return "udda";
	}

	@Bean
	public String rubberName() {

		return "Natraja";
	}

	@Bean
	public double kasu() {

		return 10.00;
	}

	@Bean
	public String rubbertype() {

		return "rubber";
	}

	@Bean
	public String rubberColour() {

		return "green";
	}

	@Bean
	public boolean isRubberStolen() {

		return true;
	}

	@Bean
	public String rubbershape() {

		return "square";
	}

	@Bean
	public String sportsName() {

		return "Hokey";
	}

	@Bean
	public String foundBy() {

		return "India";
	}

	@Bean
	public int totalNoOfPlyers() {

		return 11;
	}

}
