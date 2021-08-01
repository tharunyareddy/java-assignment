package com.training.assignment2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int originalNumber = number;

		int result = 0;

		int p = String.valueOf(number).length();

		while (number > 0) {
			int rem = number % 10;
			result += (int) Math.pow(rem, p);
			number = number / 10;

		}
		System.out.println("Given Number : " + originalNumber);
		System.out.println("Result : " + result);

		if (originalNumber == result) {
			System.out.println(originalNumber + " is Armstrong Number");
		} else {
			System.out.println(originalNumber + " is not an Armstrong Number");
		}

		sc.close();

	}

}
