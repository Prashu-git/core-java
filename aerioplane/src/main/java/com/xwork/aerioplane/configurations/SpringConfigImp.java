package com.xwork.aerioplane.configurations;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringConfigImp extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringConfigImp() {
		System.out.println("inside SpringConfigImp");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses");
		return new Class[] { SpringConfigurations.class };

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
		//WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
}
