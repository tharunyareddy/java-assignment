package com.training.assignment5;

public class Savings extends Bank{
	
	public Savings(double balance) {
		super(balance);
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}

}
