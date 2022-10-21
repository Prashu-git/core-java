package com.chartshop;

import com.chartshop.app.ChartShop;

public class ChartShopTester {

	public static void main(String[] args) {
		
		ChartShop cs = new ChartShop();
		cs.name = "BhangarPeta";
		cs.gstNo = "TYUF4208055";
		cs.address = "Thiglrupalya";
		

		
		cs.staffNames = new String[3];
		cs.staffNames[0] = "Azar";
		cs.staffNames[1] = "Rizwan";
		cs.staffNames[2] = "Baber";
		
		
		cs.billingMethod = new String[3];
		cs.billingMethod[0]= "UPI";
		cs.billingMethod[1]= "Card";
		cs.billingMethod[2]= "Cash";
		
		cs.staffContactNo = new long[3];
		cs.staffContactNo[0] = 5955656625L;
		cs.staffContactNo[1] = 8465464665L;
		cs.staffContactNo[2] = 4965695696L;

		cs.menu = new String [3];
		cs.menu [0] = "PaniPuri";	
		cs.menu [1] = "Beilpuri";
		cs.menu [2] = "MasalPuri";

		
		cs.chartsDetials();
		
		/*
		 * String staffNames[] = new String[3]; staffNames[0] = "Shashi"; staffNames[1]
		 * = "Sandesh"; staffNames[2] = "Yashvanth";
		 * 
		 * long staffContactNo[] = new long[3]; staffContactNo[0] = 9955656625L;
		 * staffContactNo[1] = 8465464665L; staffContactNo[2] = 7965695696L;
		 * 
		 * String menu[] = new String[3]; menu[0] = "PaniPuri"; menu[1] = "Beilpuri";
		 * menu[2] = "MasalPuri";
		 * 
		 * String billingMethod[] = new String[3]; billingMethod[0] = "UPI";
		 * billingMethod[1] = "Cash"; billingMethod[2] = "Card";
		 * 
		 * 
		 * 
		 * ChartShop cs = new ChartShop("TYUF4208055", "Thiglrupalya", "Bhangarpeta",
		 * staffNames, staffContactNo, menu, billingMethod);
		 * 
		 * cs.chartsDetials();
		 */
	}
}
