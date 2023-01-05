package com.sanitizer.app;

public class SanitizerDTO {

	private int id;
	private String brand;
	private double price;
	private String colour;
	

	public SanitizerDTO() {
		//System.out.println("Getting into SanitizerDTO method");

	}

	public SanitizerDTO(int id, String brand, double price, String colour) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
