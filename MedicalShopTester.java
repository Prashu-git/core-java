package com.medical.app;

import com.medical.app.medicalShop.MedicalShop;

public class MedicalShopTester {

	public static void main(String[] args) {

		String staffNames[] = new String[3];
		staffNames[0] = "Azar";
		staffNames[1] = "Rizwan";
		staffNames[2] = "Baber";

		long contactNo[] = new long[3];
		contactNo[0] = 5955656625L;
		contactNo[1] = 8465464665L;
		contactNo[2] = 4965695696L;

		String medicineName[] = new String[3];
		medicineName[0] = "Dolo 650";
		medicineName[1] = "Betnosal";
		medicineName[2] = "Eldoper";

		String cosmetics[] = new String[3];
		cosmetics[0] = "Shampoo";
		cosmetics[1] = "Powder";
		cosmetics[2] = "Soap";

		String paymentTypes[] = new String[3];
		paymentTypes[0] = "UPI";
		paymentTypes[1] = "Cash";
		paymentTypes[2] = "Card";

		MedicalShop med = new MedicalShop("AGX004208055", "Jaynagar", "Ram", staffNames, contactNo, medicineName,
				cosmetics, paymentTypes, 3);

		med.displayInfo();

	}
}
