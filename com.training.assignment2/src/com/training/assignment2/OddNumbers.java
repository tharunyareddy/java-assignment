package com.training.assignment2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Range :");

		int n = sc.nextInt();

		System.out.println("Even Numbers From 0 to n :");

		for (int i = 0; i <= n; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
