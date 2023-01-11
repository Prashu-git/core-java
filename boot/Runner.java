package com.autowireds.app.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowireds.app.component.HardwareShop;
import com.autowireds.app.component.Pencil;
import com.autowireds.app.component.Rubber;
import com.autowireds.app.component.SoftwearEngineer;
import com.autowireds.app.component.Sports;
import com.autowireds.app.configuration.Configuration1;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		HardwareShop hardwareShop = applicationContext.getBean(HardwareShop.class);
		System.out.println(hardwareShop);

		SoftwearEngineer refOfEng = applicationContext.getBean(SoftwearEngineer.class);
		System.out.println(refOfEng);

		Pencil refOfPencil = applicationContext.getBean(Pencil.class);
		System.out.println(refOfPencil);

		Rubber refOfRubber = applicationContext.getBean(Rubber.class);
		System.out.println(refOfRubber);

		Sports refOfMytype = applicationContext.getBean(Sports.class);
		System.out.println(refOfMytype);

	}

}
