package com.icecreamparlour;

import com.icecreamparlour.app.IceCreamParlour;

public class IceCreamParlourTester {

	public static void main(String[] args) {

		IceCreamParlour icep = new IceCreamParlour();
		icep.name = "PolarBear";
		icep.gstNo = "GST78545";
		icep.address = "VijayNagar";

		icep.staffNames = new String[3];
		icep.staffNames[0] = "Azar";
		icep.staffNames[1] = "Rizwan";
		icep.staffNames[2] = "Baber";

		icep.paymentTypes = new String[3];
		icep.paymentTypes[0] = "UPI";
		icep.paymentTypes[1] = "Card";
		icep.paymentTypes[2] = "Cash";

		icep.contactNo = new long[3];
		icep.contactNo[0] = 5955656625L;
		icep.contactNo[1] = 8465464665L;
		icep.contactNo[2] = 4965695696L;

		icep.menu = new String[3];
		icep.menu[0] = "CupIce";
		icep.menu[1] = "Cone";
		icep.menu[2] = "Chocbar";

		/*
		 * String staffName[] = new String[3]; staffName[0] = "Shashi"; staffName[1] =
		 * "Sandesh"; staffName[2] = "Shashank";
		 * 
		 * 
		 * 
		 * long contactNo[] = new long[3]; contactNo[0] = 9955656625L; contactNo[1] =
		 * 8465464665L; contactNo[2] = 7965695696L;
		 * 
		 * String menu[] = new String[3]; menu[0] = "CupIce"; menu[1] = "Cone"; menu[2]
		 * = "Chocbar";
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

		icep.displayInfo();
	}

}
