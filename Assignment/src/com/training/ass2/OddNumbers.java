package com.training.ass2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start Range m :");

		int m = sc.nextInt();

		System.out.println("Enter eEnd Range n :");

		int n = sc.nextInt();

		System.out.println("Odd Numbers From range " + m + " to " + n);

		for (int i = m; i <= n; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
