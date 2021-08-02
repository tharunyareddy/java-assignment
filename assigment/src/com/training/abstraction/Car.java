package com.training.abstraction;

public class Car extends Vehicle {

	public Car(String model, double price) {
		super(model, price);
	}

	@Override
	void internal() {
		System.out.println("Vehicle Internal");
	}

	@Override
	void external() {
		System.out.println("Vehicle External");
	}

	@Override
	void getMilage() {
		System.out.println("Vehicle Milage");
	}

}