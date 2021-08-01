package com.training.ass2;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character : ");

		String character = sc.next();

		String c = character.toLowerCase();

		if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
			System.out.println(character + " is Vowel");
		} else {
			System.out.println(character + " is Consonant");
		}

		sc.close();

	}

}
