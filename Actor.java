package com.springValue.app.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String language;

	private Integer age;

	public Actor(@Value("Sudeep") String name, @Value("Kannada") String language, @Value("42") Integer age) {
		this.name = name;
		this.language = language;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public String getLanguage() {
		return language;
	}

	public String getName() {
		return name;
	}
}
