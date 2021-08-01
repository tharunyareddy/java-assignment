package com.training.assignment5;

public class Bank {
	
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
		System.out.println("Balance Amount : " + balance);
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}

	double getBalance() {
		System.out.println("balance Amount");
		return balance;
	}

}
