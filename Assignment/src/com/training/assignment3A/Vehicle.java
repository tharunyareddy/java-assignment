package com.training.assignment3A;

public class Vehicle {

	String name;
	String model;
	long price;

	public Vehicle(String name, String model, int price) {
		// System.out.println("in para");
		this.name = name;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Name " + name);
		System.out.println("Model " + model);
		System.out.println("price " + price);
	}

}
