package org.newspringautowired.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Value("420")
	private int id;
	private String name;
	private String ownerName;
	@Value("Kannada")
	private String lang;
	private Double price;

	@Autowired
	public NewsPaper(@Qualifier("name") String name,@Qualifier ("publisherName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Value("5.6")
	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

}
