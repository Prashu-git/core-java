package com.xworkz.busStand.configurationes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.busStand")
public class BusSpringConfiguration {
	public BusSpringConfiguration() {
		System.out.println("inside BusSpringConfiguration " + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Inside viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("inside localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
		return local;
	}

}
