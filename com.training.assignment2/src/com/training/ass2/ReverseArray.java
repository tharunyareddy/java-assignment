package com.training.ass2;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size");

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

		System.out.println("\nReversed array : ");

		// Reversed Array
		for (int i = arraySize - 1; i >= 0; i--) {
			System.out.print(myArray[i] + "\t");
		}

		sc.close();

	}

}
