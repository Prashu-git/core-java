package com.chartshop.app;

public class ChartShop {

	public String gstNo;
	public String address;
	public String name;
	public String menu[];
	public String staffNames[];
	public String billingMethod[];
	public long staffContactNo[];

	public ChartShop() {

	}

	/*
	 * public ChartShop (String gstNo, String adrs, String na, String sn [], long
	 * mbln [], String mn [], String bm[]) {
	 * 
	 * 
	 * this.gstNo = gstNo; this.address = adrs; this.name = na; this.staffNames =
	 * sn; this.staffContactNo = mbln; this.menu = mn; this.billingMethod = bm;
	 * 
	 * 
	 * System.out.println("Chart Detials"); }
	 */
	public void chartsDetials() {

		System.out.println("The chart shop name is " + name);
		System.out.println("\n");
		System.out.println("Chart shop gstNo is " + gstNo);
		System.out.println("\n");
		System.out.println("Chart shop address is " + address);
		System.out.println("\n");

		for (int i = 0; i < staffNames.length; i++) {

			System.out.println("The Staffs working in medicial shops are " + staffNames[i]);

		}
		System.out.println("\n");
		for (int a = 0; a < staffContactNo.length; a++) {

			System.out.println("The contact Number of staffs are " + staffContactNo[a]);

		}
		System.out.println("\n");
		for (int b = 0; b < staffNames.length; b++) {

			System.out.println("The medicines name are " + staffNames[b]);

		}
		System.out.println("\n");

		for (int c = 0; c < menu.length; c++) {

			System.out.println("The cosmetics avaliable are " + menu[c]);

		}
		System.out.println("\n");
		for (int i = 0; i < billingMethod.length; i++) {

			System.out.println("The payment Method accepted are " + billingMethod[i]);

		}
		System.out.println("\n");

	}

}
