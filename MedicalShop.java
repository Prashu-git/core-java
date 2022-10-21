package com.medical.app.medicalShop;

public class MedicalShop {

	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long contactNo[];
	public String medicineName[];
	public String cosmetics[];
	public int noOfSections;
	public String paymentTypes[];
	
	public MedicalShop () {
		
		
	}

	public MedicalShop(String gstNo, String adrs, String na, String sn [], long mbln [], String mn [], String cos[], String pt[],
			int nos) {

		this.gstNo = gstNo;
		this.address = adrs;
		this.name = na;
		this.staffNames = sn;
		this.contactNo = mbln;
		this.medicineName = mn;
		this.cosmetics = cos;
		this.noOfSections = nos;
		this.paymentTypes = pt;

		System.out.println("Medical Shop Detials");
	}

	public void displayInfo() {
		
		

				
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
