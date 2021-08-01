package com.training.ass1;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println(a + " is smallest among three Numbers");
		} else if (b < a && b < c) {
			System.out.println(b + " is smallest among three Numbers");
		} else {
			System.out.println(c + " is smallest among three Numbers");
		}
		sc.close();

	}

}
