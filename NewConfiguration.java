package org.newspringautowired.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.newspringautowired.app")

public class NewConfiguration {

	@Bean
	public String name() {

		return "VijayKarnataka";
	}

	@Bean
	public String publisherName() {

		return "Sandesh";
	}

	@Bean
	public String snakeName() {
		return "Python";

	}

	@Bean
	public String type() {

		return "BigSnake";
	}

	@Bean
	public Boolean poisonous() {
		return false;

	}

	@Bean
	public String enginName() {
		return "Ninja H-2";
	}

	@Bean
	public String enginType() {

		return "four-cylinder";
	}

	@Bean
	public String enginCompany() {

		return "Ninja";
	}

	@Bean
	public Boolean isghostAlive() {
		return true;
	}

	@Bean
	public String ghostEducation() {
		return "BE";
	}

	@Bean
	public Boolean isGostMarried() {

		return true;
	}

	@Bean
	public Boolean gostKnowJava() {

		return false;
	}

	@Bean
	public String ghostHouse() {
		return "Smashana";
	}

	@Bean
	public Double ghostSalary() {
		return 456963.00;
	}

	@Bean
	public String ghostBikeName() {
		return "Scotey Pep";

	}

	@Bean
	public String ghostCarName() {
		return "Tata Nano";
	}

	@Bean
	public Boolean isGhostVeg() {
		return true;
	}

	@Bean
	public Boolean isGhostNonVeg() {
		return false;
	}

}
