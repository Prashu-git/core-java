package com.template.app.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.template.app.configuration.SpringConfiguration;
import com.template.app.dto.MissileDTO;
import com.template.app.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service = applicationContext.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println(saved);

	}

}
