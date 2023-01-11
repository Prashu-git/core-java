package com.autowireds.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("madeOf")
	private String type;
	@Autowired
	@Qualifier("money")
	private double price;
	@Autowired
	@Qualifier("pencilColour")
	private String colour;
	@Autowired
	@Qualifier("shape")
	private String shape;
	@Autowired
	@Qualifier("isStolen")
	private boolean isStolen;

	public Pencil() {
		System.out.println("inside Pencil()");

	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour + ", shape="
				+ shape + ", isStolen=" + isStolen + "]";
	}

}
