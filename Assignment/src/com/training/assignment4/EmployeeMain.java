package com.training.assignment4;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double bonus;

		String[] designation = new String[3];

		String[] name = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Employee" + (i + 1) + " Details");
			System.out.println("Name");
			name[i] = sc.nextLine();
			System.out.println("Designation");
			designation[i] = sc.nextLine();
		}

		Employee emp1 = new Employee(name[0], designation[0]);
		Employee emp2 = new Employee(name[1], designation[1]);
		Employee emp3 = new Employee(name[2], designation[2]);

		for (String var : designation) {
			switch (var) {
			case "Programmer":
				bonus = emp2.calBonus(10);
				emp2.getDetails(bonus);
				break;
			case "Manager":
				bonus = emp1.calBonus(10, 100);
				emp1.getDetails(bonus);
				break;
			case "Director":
				bonus = emp3.calBonus(10, 100, 1000);
				emp3.getDetails(bonus);
				break;
			default:
				System.out.println("Invalid designation");
			}
			System.out.println("------------------------------");
		}

		sc.close();

	}

}
