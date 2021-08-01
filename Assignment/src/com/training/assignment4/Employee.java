package com.training.assignment4;

public class Employee {

	String name, designation;
	
	//Employee Constructor
	Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	
    //Baisc Allowance
	double calBonus(double basicAllowance) {
		double bonus = basicAllowance * (8.33 / 100);
		return bonus;
	}
	
	//Baisc Allowance and Car Allowance
	double calBonus(double basicAllowance, double carAllowance) {
		double bonus = basicAllowance + carAllowance * (8.33 / 100);
		return bonus;
	}
	
	//Baisc Allowance,Car Allowance and House Allowance
	double calBonus(double basicAllowance, double carAllowance, double homeAllowance) {
		double bonus = basicAllowance + carAllowance + homeAllowance * (8.33 / 100);
		return bonus;
	}
	
	//getDetails Method
	void getDetails(double bonus) {
		System.out.println("Employee Name : " + name + "\nEmployee Designation : " + designation + "\nEmployee Bonus : " + bonus);
	}
	
}
