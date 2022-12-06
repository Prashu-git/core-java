package org.hospital1.app.Hospital;

import org.hospital1.Patients;

public class Hospital {

	public Patients patients;
	public boolean isEmergency;
	public boolean isTreatmentRequired;

	public boolean admit(Patients patients) {
		System.out.println("Inside admit method");

		boolean isAdmitted = false;

		if (isTreatmentRequired == true) {

			if (isEmergency == true) {
				this.patients = patients;
				isAdmitted = true;

				System.out.println("Is Admitted is true");
				this.patients.dispalyInfo();

				System.out.println("Patient can be allowed in ICU ward");
			}

			else {
				System.out.println("Add the patient is ");
			}
		}

		else {
			System.out.println("No treatment is required ");
		}

		return isAdmitted;
	}

}
