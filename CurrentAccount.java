package com.xworkz.banking.app.current;

import com.xworkz.banking.app.BankAccount;

public class CurrentAccount extends BankAccount {
	public static void main(String[] args) {
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit(250);
		ca.deposit(550);
		ca.withDraw(450);
		System.out.println("My current account balance is " +" " + ca.balance);
		
		CurrentAccount ca2 = new CurrentAccount();
		ca2.deposit(150);
		ca2.transfer(150, ca);
		System.out.println("Second account balance is " + " "+ ca2.balance);
		System.out.println("My account balance is " + " "+ ca.balance);

		
		
	}

}
