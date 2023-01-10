package com.springValue.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springValue.app.component.Actor;
import com.springValue.app.component.Rocket;
import com.springValue.app.component.Season;


@Configuration
@ComponentScan("com.springValue.app")
public class Conf {
	public Rocket rocket() {
		Rocket rocket1 = new Rocket();
		return rocket1;
	}
	
	@Bean
	public Actor acting() {
		Actor actor = new Actor("Darshan", "Kannada", 41);
		return actor;
	}

	@Bean
	public Season episodes() {
		Season season = new Season();
		season.setName("Spring");
		season.setDuration("Aug to oct");
		season.setStartingMonth("Auguest");
		return season;

	}
	

}
