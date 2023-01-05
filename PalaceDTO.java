package com.lambda.app.DTOClasses;

import java.io.Serializable;

public class PalaceDTO implements Serializable {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFee;

	public PalaceDTO() {

	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFee = visitingFee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFee=" + visitingFee + ", getName()=" + getName() + ", getLocation()="
				+ getLocation() + ", getBuiltBy()=" + getBuiltBy() + ", isDestroyed()=" + isDestroyed()
				+ ", getVisitingFee()=" + getVisitingFee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public boolean equales(Object object) {
		if (object != null) {
			if (object instanceof PalaceDTO) {
				PalaceDTO palace = (PalaceDTO) object;
				if (palace.name.equals(this.name)) {
					return true;
				}
			}

		}
		return false;
	}

		public String getName() {
		return name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the builtBy
	 */
	public String getBuiltBy() {
		return builtBy;
	}

	/**
	 * @return the destroyed
	 */
	public boolean isDestroyed() {
		return destroyed;
	}

	/**
	 * @return the visitingFee
	 */
	public double getVisitingFee() {
		return visitingFee;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @param builtBy the builtBy to set
	 */
	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	/**
	 * @param destroyed the destroyed to set
	 */
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	/**
	 * @param visitingFee the visitingFee to set
	 */
	public void setVisitingFee(double visitingFee) {
		this.visitingFee = visitingFee;
	}
	

}
