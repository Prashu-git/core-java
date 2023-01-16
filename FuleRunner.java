package com.fuel.app.dependency.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fuel.app.dependency.bean.PetrolBunk;
import com.fuel.app.dependency.configuration.FuleConfiguration;

public class FuleRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FuleConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		PetrolBunk petrolBunk = applicationContext.getBean(PetrolBunk.class);

		petrolBunk.purchase();
	}

}
