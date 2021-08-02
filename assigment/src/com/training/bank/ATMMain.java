package com.training.bank;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number one to withdraw \nEnter Number Two  for deposit");
		
		int select = sc.nextInt();
		
		System.out.println("Enter Your Bank Account Type \nSavings \nCurrent");
		
		sc.nextLine();
		
		String type = sc.nextLine();
		
		Bank bank = null;
		
		if (type.equalsIgnoreCase("Savings")) {
			bank = new Savings(4000);
		} else if (type.equalsIgnoreCase("Current")) {
			bank = new Current(9000);
		} 
		
		switch (select) {
		case 1:
			System.out.println("Enter Your Amount to Withdraw");
			double amount = sc.nextDouble();
			bank.withdraw(amount);
			System.out.println(bank.getBalance());
			break;
		case 2:
			System.out.println("Enter Your Amount to Deposit");
			double cash = sc.nextDouble();
			bank.deposit(cash);
			System.out.println(bank.getBalance());
			break;
		default:
			System.out.println("Something Went Wrong!!!\nGive Vaild Input\nExiting...");
		}
		
		sc.close();

	}

}
