package com.training.ass1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		System.out.println("Enter length of the array");

		Scanner sc = new Scanner(System.in);

		int arr = sc.nextInt();

		System.out.println("Usernames Array");

		String a[] = new String[arr];

		for (int i = 0; i < arr; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < arr; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println("\nEnter Username to Login");

		String username = sc.next();

		for (String i : a) {
			if (username.equals(i)) {
				System.out.println("You are logged in successfully");
				break;
			} else {
				System.out.println("Invalid username");
				break;
			}
		}

		sc.close();

	}

}
