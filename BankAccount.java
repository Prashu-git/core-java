package com.xworkz.banking.app;

public class BankAccount {
	String name;
	String ifscCode;
	String branchName;
	String accountNo;
	private double balance;

	public double withDraw(double balance) {

		this.balance = this.balance - balance;
		return this.balance;

	}

	public double deposit(double balance) {
		//
		System.out.println("Amount in my bank Account is " + " " + balance);
		this.balance = this.balance + balance;
		return this.balance;
	}

	public void transfer(double amount, BankAccount account2) {
		System.out.println("Transfering to Another Account");
		withDraw(amount);
		account2.deposit(amount);
		System.out.println("Transferring Done ... Transaction Successfull");
	}
	
	
	public void setBalance( double balance) {
		this.balance = balance;
		
	}
	public double getBalance() {
		return balance;
		
	}
}
