package com.training.ass2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		int n = sc.nextInt();

		String pattern = "";
		
		System.out.println("Number Pattern :");

		for (int i = 1; i <= n; i++) {
			pattern = pattern + i + " ";
		}

		for (int i = 0; i < n; i++) {
			System.out.println(pattern);
		}

		sc.close();
	}

}
