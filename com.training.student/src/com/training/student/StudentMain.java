package com.training.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		String id = sc.next();

		Student student = new Student(name, id);

		int a = sc.nextInt();

		int[] marks = new int[a];

		for (int i = 0; i < a; i++) {

			marks[i] = sc.nextInt();
		}

		student.getDetails();
		student.getMarks(marks);

		sc.close();

	}

}
