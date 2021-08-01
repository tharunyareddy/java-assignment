package com.training.assignment2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = 1;
		for (int i = 0; i < n; i++) {
			String pattern = "";
			for (int j = 0; j < n; j++) {
				pattern = pattern + a + " ";
				a += 1;
			}
			System.out.println(pattern);
		}

		sc.close();

	}

}
