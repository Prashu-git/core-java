package com.xwork.aerioplane.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xwork.aerioplane")
public class SpringConfigurations {

	public SpringConfigurations() {
		System.out.println("Inside SpringConfigurations " + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {

		System.out.println("inside viewResolver");

		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("inside localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
		return local;

	}

}
