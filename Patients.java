package org.hospital1;

import org.hospital1.app.Hospital.Gender;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Patients {
	private String patientName;
	private String address;
	private Gender gender;
	private int age;
	// public mobilNo ;

	/*
	 * public Patients(String patientName, String address, int age) { super();
	 * 
	 * this.patientName = patientName; this.address = address;
	 * 
	 * this.age = age; }
	 */

	public Patients() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside patients method");
	}

	public void dispalyInfo() {
		System.out.println("Patient name is : " + this.patientName);
		System.out.println("Patient address is : " + this.address);
		System.out.println("Patient gender is : " + this.gender);
		System.out.println("Patient age is : " + this.age);

	}

}
