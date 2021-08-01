package com.training.ass2;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String pattern = "";

		int m = n;

		for (int i = 1; i <= n; i++) {
			pattern = pattern + m + " ";
			System.out.println(pattern);
			m--;

		}

		sc.close();
		

	}

}
