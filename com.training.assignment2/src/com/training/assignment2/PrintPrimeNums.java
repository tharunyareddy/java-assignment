package com.training.assignment2;

import java.util.Scanner;

public class PrintPrimeNums {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start range : ");
		int m = sc.nextInt();
		System.out.println("Enter End range : ");
		int n = sc.nextInt();

		System.out.println("Prime Numbers from " + m + " to " + n + " : ");

		for (int i = m; i <= n; i++) {

			int factors = 0;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					factors += 1;
				}
			}

			if (factors == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
