package com.training.ass2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		int n = sc.nextInt();

		String pattern = "";

		int m = n;
		
		System.out.println("Number Pattern :");


		for (int i = 1; i <= n; i++) {
			pattern = pattern + m + " ";
			System.out.println(pattern);
			m--;
		}

		sc.close();

	}

}
