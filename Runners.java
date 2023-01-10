package com.springValue.app.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springValue.app.component.Actor;
import com.springValue.app.component.Rocket;
import com.springValue.app.component.Season;
import com.springValue.app.configuration.Conf;

public class Runners {

	public static void main(String[] args) {
		

			ApplicationContext container = new AnnotationConfigApplicationContext(Conf.class);
			String[] strings=container.getBeanDefinitionNames();
			System.out.println(Arrays.toString(strings));

			Rocket rocket = container.getBean("rocket",Rocket.class);
			System.out.println(rocket);
			System.out.println(rocket.getCountry());
			System.out.println(rocket.getName());
			System.out.println(rocket.getPrice());

			Rocket rocket2 = container.getBean("spaceRocket", Rocket.class);
			System.out.println(rocket2);
			System.out.println(rocket2.getCountry());
			System.out.println(rocket2.getName());
			System.out.println(rocket2.getPrice());

			Actor actor = container.getBean("actor", Actor.class);
			System.out.println(actor);
			System.out.println(actor.getName());
			System.out.println(actor.getLanguage());
			System.out.println(actor.getAge());

			Actor actor2 = container.getBean("acting", Actor.class);
			System.out.println(actor2);
			System.out.println(actor2.getName());
			System.out.println(actor2.getLanguage());
			System.out.println(actor2.getAge());

			Season refOfSeason = container.getBean("season",Season.class);
			System.out.println(refOfSeason);
			System.out.println(refOfSeason.getName());
			System.out.println(refOfSeason.getDuration());
			System.out.println(refOfSeason.getStartingMonth());

			Season refOfSeason1 = container.getBean("season", Season.class);
			System.out.println(refOfSeason1);
			System.out.println(refOfSeason1.getName());
			System.out.println(refOfSeason1.getDuration());
			System.out.println(refOfSeason1.getStartingMonth());
		}

	}

