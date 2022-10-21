package com.milkparlour;

import com.milkparlour.app.Milkparlour;

public class MilkParlourTester {

	public static void main(String[] args) {

		Milkparlour ml = new Milkparlour();
		ml.name = "Nandni";
		ml.gstNo = "GST78545";
		ml.address = "Jaynagar";

		ml.staffNames = new String[3];
		ml.staffNames[0] = "Azar";
		ml.staffNames[1] = "Rizwan";
		ml.staffNames[2] = "Baber";

		ml.paymentTypes = new String[3];
		ml.paymentTypes[0] = "UPI";
		ml.paymentTypes[1] = "Card";
		ml.paymentTypes[2] = "Cash";

		ml.contactNo = new long[3];
		ml.contactNo[0] = 5955656625L;
		ml.contactNo[1] = 8465464665L;
		ml.contactNo[2] = 4965695696L;

		ml.menu = new String[3];
		ml.menu[0] = "Orange";
		ml.menu[1] = "Blue";
		ml.menu[2] = "White";

		/*
		 * String staffName[] = new String[3]; staffNames[0] = "Azar"; staffNames[1] =
		 * "Rizwan"; staffNames[2] = "Baber";
		 * 
		 * 
		 * 
		 * long contactNo[] = new long[3]; contactNo[0] = 9955656625L; contactNo[1] =
		 * 8465464665L; contactNo[2] = 7965695696L;
		 * 
		 * String menu[] = new String[3]; menu[0] = "Orange"; menu[1] = "Blue"; menu[2]
		 * = "White";
		 * 
		 * String paymentTypes[] = new String[3]; paymentTypes[0] = "UPI";
		 * paymentTypes[1] = "Cash"; paymentTypes[2] = "Card";
		 * 
		 * 
		 * 
		 * 
		 * IceCreamParlour icep = new IceCreamParlour("PolarBear" , "GST78545" ,
		 * "VijayNagar" , staffName , contactNo, menu, paymentTypes );
		 */

		ml.displayInfo();
	}

}
