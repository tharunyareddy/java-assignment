package com.training.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");

		int arraySize = sc.nextInt();
		
		int[] myArray = new int[arraySize];
		
		System.out.println("Enter Values :");
		
		for(int i = 0;i < arraySize;i++) {
			myArray[i] = sc.nextInt();
		}
		
		System.out.println("Array");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(myArray[i] + "\t");
		}
		
		Arrays.sort(myArray);

		System.out.println("\nSorted array : ");
		
		//Sorted Array
		for (int i = 0; i < arraySize; i++) {
			System.out.print(myArray[i] + "\t");
		}
		
		//To find duplicates in array
		System.out.println("\n");
		System.out.println("Duplicates in Array : ");
		for(int j=1;j<arraySize;j++) {
			int k=0;
			boolean check=false;
			while(k<j)
			{
				if((j!=k) && myArray[j] == myArray[k])
					check=true;
				k++;
			}
			if(check) {
				System.out.println(myArray[j]);
			}
		}
		
		sc.close();

	}

}
