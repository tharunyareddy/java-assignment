package com.training.ass2;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year : ");

		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap year");
				} else {
					System.out.println(year + " is not a Leap year");
				}
			} else {
				System.out.println(year + " is leap year");
			}
		} else {
			System.out.println(year + " is not a leap year");
		}

		sc.close();

	}

}
