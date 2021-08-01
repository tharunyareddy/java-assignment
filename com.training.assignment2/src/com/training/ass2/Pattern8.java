package com.training.ass2;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		int length = word.length();
		String pattern = "";
		for (int i = 0; i < length; i++) {
			pattern += word.charAt(i) + " ";
			System.out.println(pattern);
		}
		

		sc.close();

	}

}
