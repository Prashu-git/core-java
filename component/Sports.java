package com.autowireds.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sports {

	@Autowired
	@Qualifier("sportsName")
	private String name;

	@Autowired
	private int totalNoOfPlyers;

	@Autowired
	@Qualifier("foundBy")
	private String nationalGameOf;

	public Sports() {

		System.out.println("inside Sports()");

	}

	@Override
	public String toString() {
		return "Sports [name=" + name + ", totalNoOfPlyers=" + totalNoOfPlyers + ", nationalGameOf=" + nationalGameOf
				+ "]";
	}

}
