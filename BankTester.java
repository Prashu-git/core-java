package com.bank;

import com.bank.app.Bank;

public class BankTester {
	public static void main(String[] args) {

		Bank bb = new Bank();
		bb.deposit(500);
		bb.withdrawal(100);
		bb.name = "Bank of India";
		bb.accountNo = "15967862078";
		bb.branchName = "Jaynagar Branch";
		bb.ifscCode = "BKID003560";

		System.out.println("The bank name is " + " " + bb.name);
		System.out.println("The account no is " + " " + bb.accountNo);
		System.out.println("The bank branch name is " + " " + bb.branchName);
		System.out.println("The bank ifsccode is " + " " + bb.ifscCode);
		// System.out.println("The bank name is " + " "+ bb.name);

		System.out.println("My account balance is " + " " + bb.balance);

		Bank bb2 = new Bank();
		bb2.deposit(200);
		bb2.withdrawal(50);

		bb2.transfer(10, bb);
		System.out.println("My 2nd account balance is " + " " + bb2.balance);
		System.out.println("My account balance is after transaction " + " " + bb.balance);

	}

}
