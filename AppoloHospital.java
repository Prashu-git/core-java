package org.hospital1.app.Hospital;

import java.util.Iterator;

import org.hospital1.Patients;

public class AppoloHospital extends Hospital {

	public Patients[] patients;
	int index;

	public AppoloHospital(int size) {
		patients = new Patients[size];

	}

	public boolean addPatients(Patients patient) {

		boolean isPatientAdded = false;
		if (patient != null) {
			System.out.println("Patients details are registerd");
			patients[index++] = patient;
			isPatientAdded = true;

		}

		return isPatientAdded;

	}

	public void getAllPatients() {

		System.out.println("list of patients");
		for (int i = 0; i < patients.length; i++) {

			System.out.println(patients[i].getAddress() + " " + patients[i].getAge() + " " + patients[i].getPatientName() +" "+ patients[i].getGender());
		}

	}
	
	public void getPatientByName(String patientName) {
		
		System.out.println("inside getPatientByName");
		System.out.println("No of parameters : 1 : patientName(String)");
		
		for (int i = 0; i < patients.length; i++) {
			
			if (patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getAddress() + " " + patients[i].getAge() + " " + patients[i].getPatientName() +" "+ patients[i].getGender());
				
			}
			else {
				System.out.println("Patient not found");
			}
		}
		
	}
	
	public void getPatientByAge(int patientAge) {
		System.out.println("inside getPatientByAge");
		System.out.println("No of parameters : 1 : age(int)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getAge() == patientAge) {
				System.out.println(patients[i].getAddress() + " " + patients[i].getAge() + " " + patients[i].getPatientName() +" "+ patients[i].getGender());
				
			}
			else {
				System.out.println("Patient age not found");
			}
			
		}

		
		
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("inside getPatientByGender ");
		System.out.println("No of parameters : 1 : Gender (gender)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getAddress() + " " + patients[i].getAge() + " " + patients[i].getPatientName() +" "+ patients[i].getGender());

				
			}
			else {
				System.out.println("Patient  not found");
			}
			
		}
	}
	
	public void getPatientByAddress(String patientAddress) {
		System.out.println("inside getPatientByAddress  ");
		System.out.println("No of parameters : 1 : String (address)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getAddress().equals(patientAddress)) {
				System.out.println(patients[i].getAddress() + " " + patients[i].getAge() + " " + patients[i].getPatientName() +" "+ patients[i].getGender());

				
			}
			else {
				System.out.println("Patient  not found");
			}
			
		}
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("inside getPatientNameByGender");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName());
				
			}
			else {
				System.out.println("Patient not found");
			}
			
		}
		
	}
	
	public void getGenderByPatientName(String name) {
		System.out.println("inside getGenderByPatientName");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getPatientName().equals(name)) {
				System.out.println(patients[i].getGender());
				
			}
			else {
				System.out.println("Patient not found");
			}
		}
		
		
	}
	
}
		
	
