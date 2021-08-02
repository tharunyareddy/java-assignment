package com.training.assignment6;

public class Savings extends Bank{
	
	public Savings(double balance) {
		super(balance);
	}
    @Override
	public void withdraw(double amount) {
		balance -= amount;
	}
    @Override
	void deposit(double amount) {
		balance += amount;
	}

}
