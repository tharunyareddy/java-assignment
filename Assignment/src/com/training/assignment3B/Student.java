package com.training.assignment3B;

public class Student {

	String name;
	int id;
	int noOfSubjects;
	int marks[] = new int[noOfSubjects];

	Student(int noOfSubjects, String name, int id, int marks[]) {
		this.noOfSubjects = noOfSubjects;
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public void getStudentDetails() {

		System.out.println("Student Name : " + name + "\nStudent Id : " + id + "\nStudent Total Marks : " + sum
				+ "\nStudent Average Mark : " + avg + "\nStudent Grade : " + grade);
		System.out.println("Each Subject Marks : ");
		for (int var : marks)
			System.out.println(var);
	}

	int sum = 0;
	String grade;
	float avg = 0.0f;

	public void getStudentGrades() {

		for (int var : marks) {
			sum += var;
			avg = sum / noOfSubjects;
		}

		if (avg > 90) {
			grade = "A";
		} else if (avg > 75) {
			grade = "B";
		} else {
			grade = "C";
		}

	}
}
