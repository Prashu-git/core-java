package com.xworz.game.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworz.game")
public class GoaConfiguration {

	public GoaConfiguration() {
		System.out.println("Running : " + getClass().getSimpleName());
	}

}
