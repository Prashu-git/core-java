package org.hospital1.app.Patient;

import java.util.Scanner;

import org.hospital1.Patients;
import org.hospital1.app.Hospital.AppoloHospital;
import org.hospital1.app.Hospital.Gender;

public class AppoloTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int size = sc.nextInt();

		AppoloHospital appoloHospital = new AppoloHospital(size);
		for (int i = 0; i < size; i++) {
			Patients pt = new Patients();

			System.out.println("Enter patient name");
			pt.setPatientName(sc.next());

			System.out.println("Enter patient age");
			pt.setAge(sc.nextInt());

			System.out.println("Emter patient addres");
			pt.setAddress(sc.next());

			System.out.println("Enter patient gender");
			String gender = sc.next();
			pt.setGender(Gender.valueOf(gender));
			appoloHospital.addPatients(pt);

		}

		// appoloHospital.getAllPatients();
		System.out.println("Enter Patient name");
		String patientName = sc.next();
		appoloHospital.getPatientByName(patientName);

		System.out.println("Enter Patient Age");
		int patientAge = sc.nextInt();
		appoloHospital.getPatientByAge(patientAge);

		System.out.println("Enter Patient Address");
		String patientAddress = sc.next();
		appoloHospital.getPatientByAddress(patientAddress);
		System.out.println();

		System.out.println("enter patient gende");
		Gender gender2 = Gender.valueOf(sc.next());
		appoloHospital.getPatientByGender(gender2);

		System.out.println("enter gender to get patient name");
		Gender gender = Gender.valueOf(sc.next());
		appoloHospital.getPatientNameByGender(gender);

		System.out.println("enter name to get patient gende");
		String name = sc.next();
		appoloHospital.getGenderByPatientName(name);

	}

}
