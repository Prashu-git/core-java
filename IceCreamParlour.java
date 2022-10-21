package com.icecreamparlour.app;

public class IceCreamParlour {

	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long contactNo[];
	public String menu[];
	public String paymentTypes[];

	public IceCreamParlour() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public IceCreamParlour(String gstNo, String address, String name, String[]
	 * staffNames, long[] contactNo, String[] menu, String[] paymentTypes) {
	 * 
	 * this.gstNo = gstNo; this.address = address; this.name = name; this.staffNames
	 * = staffNames; this.contactNo = contactNo; this.menu = menu; this.paymentTypes
	 * = paymentTypes;
	 * 
	 * System.out.println("Ice Cream Shop Detials");
	 */
	// }

	public void displayInfo() {

		System.out.println("IceCream shop name is" + name);
		System.out.println("\n");
		System.out.println("Ice shop gstNo is " + gstNo);
		System.out.println("\n");
		System.out.println("ice shop address is " + address);
		System.out.println("\n");
		for (int i = 0; i < staffNames.length; i++) {

			System.out.println("The Staffs working in ice shops are " + staffNames[i]);

		}
		System.out.println("\n");
		for (int a = 0; a < contactNo.length; a++) {

			System.out.println("The contact Number of staffs are " + contactNo[a]);

		}

		System.out.println("\n");

		for (int c = 0; c < menu.length; c++) {

			System.out.println("The ice avaliable are " + menu[c]);

		}
		System.out.println("\n");
		for (int i = 0; i < paymentTypes.length; i++) {

			System.out.println("The payment Method accepted are " + paymentTypes[i]);

		}
		System.out.println("\n");

	}

}
