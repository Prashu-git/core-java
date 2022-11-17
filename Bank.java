package com.bank.app;

public class Bank {
	public String name;
	public String ifscCode;
	public String branchName;
	public String accountNo;
	public double balance;
	//System.out.println("The Bank name is " + " " + na);

	public double withdrawal(double balance) {
		this.balance = this.balance - balance;
		return this.balance;
		

	}

	public double deposit(double balance) {
		this.balance = this.balance + balance;
		return this.balance;

	}

	public void transfer(double amount, Bank account2) {
		deposit(amount);
		account2.withdrawal(amount);
		System.out.println("Transferring Done ... Transaction Successfull");
	}



}
