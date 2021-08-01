package com.training.student;

public class Student {

	String name, id;
	int marks;
	int sum = 0;

	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void getDetails() {
		System.out.println("name :  " + name);
		System.out.println("id : " + id);
	}

	public void getMarks(int[] marks) {
		for (int i : marks) {
			sum += i;
		}
		this.marks = sum;
		System.out.println("sum : " + this.marks);
		System.out.println("average : " + (int) sum / marks.length);
	}
}
