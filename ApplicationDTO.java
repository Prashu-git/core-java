package com.lambda.app.DTOClasses;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	
	private String name;
	private double version;
	private String developedBy;
	private double price;
	
	public ApplicationDTO() {
		
		
	}

	public ApplicationDTO(String name, double version, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 40;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if (obj instanceof ApplicationDTO) {
				
				ApplicationDTO applicationDTO = (ApplicationDTO) obj;
				if(applicationDTO.name.equals(this.name) && applicationDTO.developedBy.equals(this.developedBy)) {
					return true;
				}
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", price="
				+ price + "]";
	}

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
