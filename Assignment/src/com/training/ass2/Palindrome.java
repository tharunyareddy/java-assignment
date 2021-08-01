package com.training.ass2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Word to check palindrone or not : ");

		String w = sc.next();
		String word = w.toLowerCase();
		int length = word.length();
		String check = "";

		for (int i = length - 1; i >= 0; i--) {
			check += word.charAt(i);
		}

		if (word.equals(check)) {
			System.out.println(w + " is a Palindrome");
		} else {
			System.out.println(w + "is not a Palindrome");
		}

		sc.close();

	}

}
