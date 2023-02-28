package com.xworkz.busStand.configurationes;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BusSpringConfigurationImp extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public BusSpringConfigurationImp() {
		System.out.println("inside BusSpringConfigurationImp" + getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses");
		return new Class[] { BusSpringConfiguration.class };

	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("inside DefaultServletHandlerConfigurer");
		configurer.enable();
	}

}
