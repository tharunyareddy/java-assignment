package com.training.assignment6;

public class Current extends Bank{
	
	public Current(double balance) {
		super(balance);
	}
	
    @Override
	public void withdraw(double amount) {
		balance = balance - amount;
	}
    @Override
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
}
