package com.training.ass1;

public class Ternary {

	public static void main(String[] args) {

		int a = 10, b = 120, c = 30;
		//Using Ternary operator
		String result = (a > b) && (a > c) ? "a is greater" : (b > c) ? "b is greater" : "c is greater";

		System.out.println(result);

	}

}
