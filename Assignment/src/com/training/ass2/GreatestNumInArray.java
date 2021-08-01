package com.training.ass2;

import java.util.Scanner;

public class GreatestNumInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");

		int arraySize = sc.nextInt();

		int[] myArray = new int[arraySize];

		System.out.println("Enter Values");

		// To Populate Values into an Array
		for (int i = 0; i < arraySize; i++) {
			myArray[i] = sc.nextInt();
		}

		System.out.println("Array");

		// Array
		for (int i = 0; i < arraySize; i++) {
			System.out.print(myArray[i] + "\t");
		}

		int greatestNumber = myArray[0];
		int smallestNumber = myArray[0];

		for (int i = 1; i < arraySize; i++) {
			// To Find Greatest Number
			if (greatestNumber < myArray[i]) {
				greatestNumber = myArray[i];
			}
			// To Find Smallest Number
			if (smallestNumber > myArray[i]) {
				smallestNumber = myArray[i];
			}
		}
		System.out.println("\n");
		System.out.println("Greatest Number is " + greatestNumber);
		System.out.println("\nSmallest NUmber is " + smallestNumber);
		sc.close();

	}

}
