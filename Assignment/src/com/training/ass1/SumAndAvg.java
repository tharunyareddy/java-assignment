package com.training.ass1;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {

		System.out.println("Enter length of the array");

		Scanner sc = new Scanner(System.in);

		int arr = sc.nextInt();

		System.out.println("Populating");

		int a[] = new int[arr];

		for (int i = 0; i < arr; i++) {
			a[i] = sc.nextInt();

		}

		System.out.println("Array");

		for (int i = 0; i < arr; i++) {
			System.out.print(a[i] + "\t");
		}

		double total = 0;

		for (int i = 0; i < a.length; i++) {

			total = total + a[i];

		}

		double average = total / a.length;

		sc.close();

		System.out.println("\nSum : " + total);
		System.out.println("Average : " + average);

	}

}
