package com.training.assignment6;

public abstract class Bank {
	
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
		System.out.println("Balance Amount : " + balance);
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	double getBalance() {
		System.out.println("balance Amount");
		return balance;
	}

}
