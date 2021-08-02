package com.training.abstraction;

public abstract class Vehicle extends Accessories {

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	String model;
	double price;

	public void getDetials() {
		System.out.println("Vehicle Model : " + model);
		System.out.println("Vehicle Price : " + price);
	}

	abstract void getMilage();
}