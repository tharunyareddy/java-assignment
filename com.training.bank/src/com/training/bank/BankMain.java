package com.training.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		int amount = 0;
		Scanner sc = new Scanner(System.in);
		do {
			Bank bank = new Bank(100000.00);
			System.out.println("Bank Balance : ");
			bank.getBalance();
			System.out.println("Deposit Amount:");
			double deposit = sc.nextDouble();
			bank.deposit(deposit);
			System.out.println("Balance :");
			bank.getBalance();
			System.out.println("Withdrawal Amount :");
			double withdrawl = sc.nextDouble();
			bank.withdrawl(withdrawl);
			bank.getBalance();
		} while (amount != 1);
		sc.close();

	}

}
