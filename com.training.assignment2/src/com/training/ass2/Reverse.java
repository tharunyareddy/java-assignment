package com.training.ass2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String w = sc.next();

		String word = w.toLowerCase();
		int length = word.length();
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		System.out.println(reverse);
		sc.close();

	}

}
