package com.training.ass2;

import java.util.Scanner;

public class PrintPrimeNums {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start Range m : ");

		int m = sc.nextInt();
		
		System.out.println("Enter End Range n : ");

		int n = sc.nextInt();
		
		System.out.println("Prime Numbers From "+m+" to "+n);
		for(int i=m;i<=n;i++) {
			int factors = 0;
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					factors = factors + 1;
				}
			}
			if (factors == 0) {
				System.out.println(i);
			}

		}

		
		sc.close();


	}

}
