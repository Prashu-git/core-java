package org.newspringautowired.app.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Snake {

	private String name;
	@Value("9.5")
	private Double length;
	@Value("black")
	private String colour;
	private String type;
	private Boolean poisonous;

	public Snake(@Qualifier("snakeName") String name, @Qualifier("type") String type,
			@Qualifier("poisonous") Boolean poisonous) {
		super();
		this.name = name;
		this.type = type;
		this.poisonous = poisonous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}

}
