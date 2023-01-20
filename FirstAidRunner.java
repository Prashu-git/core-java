package com.template.app.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.template.app.configuration.SpringConfiguration;
import com.template.app.dto.FirstAidDTO;
import com.template.app.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = applicationContext.getBean(FirstAidService.class);

		// boolean save = applicationContext.validateAndSave(new FirstAidDTO());

		boolean save = service.validateAndSave(new FirstAidDTO());
		System.out.println(save);

	}

}
