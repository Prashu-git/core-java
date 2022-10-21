package com.medical.app;

import com.medical.app.medical.Medical;

public class MedicalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medical med = new Medical();
		med.gstNo = "AGX004208055";
		med.address = "Jaynagar";
		med.name = "Ram";
		med.noOfSections = 3;

		med.staffNames = new String[3];
		med.staffNames[0] = "Azar";
		med.staffNames[1] = "Rizwan";
		med.staffNames[2] = "Baber";

		med.contactNo = new long[3];
		med.contactNo[0] = 5955656625L;
		med.contactNo[1] = 8465464665L;
		med.contactNo[2] = 4965695696L;

		med.medicineName = new String[3];
		med.medicineName[0] = "Dolo 650";
		med.medicineName[1] = "Betnosal";
		med.medicineName[2] = "Eldoper";

		med.cosmetics = new String[3];
		med.cosmetics[0] = "Shampoo";
		med.cosmetics[1] = "Powder";
		med.cosmetics[2] = "Soap";

		med.paymentTypes = new String[3];
		med.paymentTypes[0] = "UPI";
		med.paymentTypes[1] = "Cash";
		med.paymentTypes[2] = "Card";

		med.displayInfo1();

	}

}
