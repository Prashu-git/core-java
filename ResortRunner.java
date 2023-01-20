package com.template.app.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.template.app.configuration.SpringConfiguration;
import com.template.app.dto.ResortDTO;
import com.template.app.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService resortService = applicationContext.getBean(ResortService.class);
		boolean saved = resortService.validateAndSave(new ResortDTO());
		System.out.println(saved);

	}

}
