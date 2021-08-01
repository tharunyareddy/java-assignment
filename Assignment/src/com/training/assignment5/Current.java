package com.training.assignment5;

public class Current extends Bank{
	
	public Current(double balance) {
		super(balance);
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}
	
}
