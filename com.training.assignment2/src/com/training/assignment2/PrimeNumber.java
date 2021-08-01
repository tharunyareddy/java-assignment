package com.training.assignment2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		
		int factors;
		
		if(number > 1) {
		    factors = 0;
		}else {
		    factors = 1;
		}
		
		
		for(int i=2;i < number;i++) {
			if(number%2 == 0) {
				factors += 1;
			}
		}
		
		if(factors == 0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
		sc.close();
	}

}
