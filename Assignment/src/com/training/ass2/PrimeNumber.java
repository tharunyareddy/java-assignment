package com.training.ass2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		int number = sc.nextInt();

		int factors;

		if (number > 1) {
			factors = 0;
		} else {
			factors = 1;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factors = factors + 1;
			}
		}

		if (factors == 0) {
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is not a Prime Number");
		}

		sc.close();

	}

}
