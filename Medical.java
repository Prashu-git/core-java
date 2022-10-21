package com.medical.app.medical;

public class Medical {

	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long contactNo[];
	public String medicineName[];
	public String cosmetics[];
	public int noOfSections;
	public String paymentTypes[];

	public Medical() {

		System.out.println("Medical Shop Detials");
	}

	public void displayInfo1() {
		System.out.println("Medical shop name is" + name);
		System.out.println("\n");
		System.out.println("Medical shop gstNo is " + gstNo);
		System.out.println("\n");
		System.out.println("Medical shop address is " + address);
		System.out.println("\n");
		System.out.println("Medical shop section is " + noOfSections);
		System.out.println("\n");
		for (int i = 0; i < staffNames.length; i++) {

			System.out.println("The Staffs working in medicial shops are " + staffNames[i]);

		}
		System.out.println("\n");
		for (int a = 0; a < contactNo.length; a++) {

			System.out.println("The contact Number of staffs are " + contactNo[a]);

		}
		System.out.println("\n");
		for (int b = 0; b < medicineName.length; b++) {

			System.out.println("The medicines name are " + medicineName[b]);

		}
		System.out.println("\n");

		for (int c = 0; c < cosmetics.length; c++) {

			System.out.println("The cosmetics avaliable are " + cosmetics[c]);

		}
		System.out.println("\n");
		for (int i = 0; i < paymentTypes.length; i++) {

			System.out.println("The payment Method accepted are " + paymentTypes[i]);

		}
		System.out.println("\n");

	}

}
