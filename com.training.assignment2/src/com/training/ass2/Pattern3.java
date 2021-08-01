package com.training.ass2;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String pattern = "";

		for (int i = 1; i <= n; i++) {
			pattern = pattern + i + " ";
			System.out.println(pattern);
		}
        sc.close();
	} 

}
