
package com.xworkz.banking.savings;

import com.xworkz.banking.app.BankAccount;

public class SavingsAccount extends BankAccount {

	public double interestRate;

	public SavingsAccount() {

		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * 
	 * 
	 * SavingsAccount sa = new SavingsAccount(); sa.deposit(100); sa.withDraw(55);
	 * 
	 * System.out.println("My Savings account balance is" + " " + sa.balance);
	 * 
	 * SavingsAccount sa2 = new SavingsAccount(); sa2.withDraw(55);
	 * sa2.deposit(170); sa2.transfer(20, sa);
	 * System.out.println("Second account balance is " + " " + sa2.balance);
	 * System.out.println("My savings  Account balance is " +" "+ sa.balance); }
	 */

	public void periodicInterest() {
		double newBalance = getBalance() * interestRate / 100;
		deposit(newBalance);

	}
}
