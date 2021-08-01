package com.training.ass2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		String pattern;
		
		System.out.println("Star Pattern :");

		for (int i = 0; i <= n; i++) {
			pattern = "* ".repeat(n - i);
			System.out.println(pattern);
		}
		sc.close();

	}

}
