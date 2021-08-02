package com.training.abstraction;

public class Main {

	public static void main(String[] args) {

		System.out.println("Vehicles Details : ");

		System.out.println("-----------------------------------");

		Accessories car = new Car("BMW", 80000);
		Vehicle vehicle = (Vehicle) car;
		car.internal();
		car.external();
		vehicle.getMilage();
		vehicle.getDetials();

		System.out.println("-----------------------------------");

		Accessories bike = new Car("BMW", 100000);
		Vehicle vehicle1 = (Vehicle) bike;
		vehicle1.getDetials();
		bike.internal();
		bike.external();
		vehicle1.getMilage();

		System.out.println("------------------------------------");
	}

}
