package com.training.assignment3B;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of subjects : ");
		int noOfSubjects = sc.nextInt();

		int myArray[] = new int[noOfSubjects];

		System.out.println("Student Name : ");
		String name = sc.next();

		System.out.println("Student Id : ");
		int id = sc.nextInt();

		System.out.println("Number of Subjects : " + noOfSubjects);
		System.out.println("Enter Marks : ");

		for (int i = 0; i < noOfSubjects; i++) {
			myArray[i] = sc.nextInt();
		}

		Student student1 = new Student(noOfSubjects, name, id, myArray);
		student1.getStudentGrades();
		student1.getStudentDetails();
		sc.close();
	}

}
