package com.training.assignment2;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		System.out.println("Enter length of the array");

		Scanner sc = new Scanner(System.in);

		int arraySize = sc.nextInt();

		System.out.println("Enter Values of Array");

		int myArray[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			myArray[i] = sc.nextInt();

		}

		System.out.println("Array");

		for (int i = 0; i < arraySize; i++) {
			System.out.print(myArray[i] + "\t");
		}

		int sum = 0;

		for (int i = 0; i < arraySize; i++) {

			sum += myArray[i];

		}

		double average = sum / arraySize;

		sc.close();

		System.out.println("\nTotal " + sum);
		System.out.println("Average " + average);

	}

}
