package com.fuel.app.dependency.browserRunner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fuel.app.dependency.bean.Browser;
import com.fuel.app.dependency.configuration.BrowserConfigureation;
import com.fuel.app.dependency.implementation.Chrome;
import com.fuel.app.dependency.implementation.FireBox;

public class BrowserRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BrowserConfigureation.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		/*
		 * Browser browser = applicationContext.getBean(Browser.class);
		 * browser.browser();
		 */

		Chrome chrome = applicationContext.getBean(Chrome.class);
		chrome.browser();

		FireBox fireBox = applicationContext.getBean(FireBox.class);
		fireBox.browser();
	}

}
