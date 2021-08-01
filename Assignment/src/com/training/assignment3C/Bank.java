package com.training.assignment3C;

public class Bank {

	double balance;

	public Bank(double b) {
		balance = b;
	}

	public void deposit(double deposit) {
		balance = balance + deposit;
	}

	public void withdrawl(double withdrawal) {
		balance = balance - withdrawal;
	}

	public void getBalance() {
		System.out.println(balance);
	}
}