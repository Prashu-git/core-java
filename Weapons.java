package com.weapons.app.DTOClass;

public class Weapons implements Comparable<Weapons>{
	
	private String name;
	private String madeBy;
	//private String ;
	private double price;
	private Type type;
	
	
	public  Weapons() {
		
	}


	public Weapons(String name, String madeBy, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.price = price;
		this.type = type;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 23;
	}
	
	@Override
	public int compareTo(Weapons o) {
		
		return  (Double.compare(o.price,this.price));
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof Weapons) {
				Weapons weapons = (Weapons) obj;
				if(weapons.name.equals(this.name)) {
					return true;
				}
				
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "Weapons [name=" + name + ", madeBy=" + madeBy + ", price=" + price + ", type=" + type + "]";
	}


	public String getName() {
		return name;
	}


	public String getMadeBy() {
		return madeBy;
	}


	public double getPrice() {
		return price;
	}


	public Type getType() {
		return type;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	
	

	

}
