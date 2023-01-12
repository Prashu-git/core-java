package org.newspringautowired.app.runners;

import java.util.Arrays;

import org.newspringautowired.app.components.Ghost;
import org.newspringautowired.app.components.NewsPaper;
import org.newspringautowired.app.components.Snake;
import org.newspringautowired.app.configuration.NewConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class NewRunner {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(NewConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		NewsPaper newsPaper = applicationContext.getBean(NewsPaper.class);

		System.out.println(newsPaper);

		Snake snake = applicationContext.getBean(Snake.class);

		System.out.println(snake);

		Engine engine = applicationContext.getBean(Engine.class);

		System.out.println(engine);

		Ghost ghost = applicationContext.getBean(Ghost.class);
		System.out.println(ghost);

	}

}
