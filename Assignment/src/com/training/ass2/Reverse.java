package com.training.ass2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Word : ");

		String word = sc.next();

		int length = word.length();
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		System.out.println("Reversed Word : ");
		System.out.println(reverse);
		sc.close();

	}

}
