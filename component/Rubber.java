package com.autowireds.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubbertype")
	private String type;
	@Autowired
	@Qualifier("kasu")
	private double price;
	@Autowired
	@Qualifier("rubberColour")
	private String colour;
	@Autowired
	@Qualifier("rubbershape")
	private String shape;
	@Autowired
	@Qualifier("isRubberStolen")
	private boolean isStolen;

	public Rubber() {
		System.out.println("insid Rubber()");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour + ", shape="
				+ shape + ", isStolen=" + isStolen + "]";
	}

}
