package com.assignment;

import com.assignment.company.Company;

public class CompanyTester {
	public static void main(String[] args) {
		Company company = new Company();
		company.toWork();

		Company company2 = new Company();
		company2.name = "TCS";
		company2.displayInfo();
	}

}
