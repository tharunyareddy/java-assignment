package com.training.assignment2;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String w = sc.next();

		String word = w.toLowerCase();
		int length = word.length();
		String pattern = "";
		String reverse = "";
		for (int i = 0; i < length; i++) {
			pattern += word.charAt(i) + " ";
			System.out.println(pattern);
		}
		

		for (int i = length - 1; i >= 0; i--) {
			reverse += word.charAt(i) + " ";
			System.out.println(reverse);
		}
		sc.close();

	}

}
