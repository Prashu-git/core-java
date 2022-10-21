package com.milkparlour.app;

public class Milkparlour {

	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long contactNo[];
	public String menu[];
	public String paymentTypes[];

	public Milkparlour() {
		// TODO Auto-generated constructor stub
	}

	public Milkparlour(String gstNo, String address, String name, String[] staffNames, long[] contactNo, String[] menu,
			String[] paymentTypes) {

		this.gstNo = gstNo;
		this.address = address;
		this.name = name;
		this.staffNames = staffNames;
		this.contactNo = contactNo;
		this.menu = menu;
		this.paymentTypes = paymentTypes;

		System.out.println("Milk Shop Detials");
	}

	public void displayInfo() {

		System.out.println("Milk shop name is" + name);
		System.out.println("\n");
		System.out.println("Milk shop gstNo is " + gstNo);
		System.out.println("\n");
		System.out.println("Milk shop address is " + address);
		System.out.println("\n");
		for (int i = 0; i < staffNames.length; i++) {

			System.out.println("The Staffs working in milk shops are " + staffNames[i]);

		}
		System.out.println("\n");
		for (int a = 0; a < contactNo.length; a++) {

			System.out.println("The contact Number of staffs are " + contactNo[a]);

		}

		System.out.println("\n");

		for (int c = 0; c < menu.length; c++) {

			System.out.println("The milks avaliable are " + menu[c]);

		}
		System.out.println("\n");
		for (int i = 0; i < paymentTypes.length; i++) {

			System.out.println("The payment Method accepted are " + paymentTypes[i]);

		}
		System.out.println("\n");

	}

}
