package com.grocery.client;

import java.util.Scanner;

import com.grocery.exception.ItemNotFoundException;
import com.grocery.model.Product;
import com.grocery.service.GroceryService;
import com.grocery.service.GroceryServiceImpl;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Please Select your Choice : \n1.Enter Product Name\n2.Enter Product Id\n3.See All the Products");

		int select = scanner.nextInt();

		GroceryService groceryReference = new GroceryServiceImpl();
		switch (select) {
		case 1:
			System.out.println("Enter the Product Name :");
			String productName = scanner.next();
			try {
				Product[] products = groceryReference.getByProductName(productName);
				for (Product product : products) {
					if (product != null) {
						System.out.println(product);
					}
				}
			} catch (ItemNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter the Product Id:");
			int productId = scanner.nextInt();
			try {
				System.out.println(groceryReference.getByProductId(productId));
			} catch (ItemNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Currently Available Products :");

			Product[] products = groceryReference.getAll();
			for (Product product : products) {
				System.out.println(product);
			}
			break;
		default:
			System.out.println("Please Select Valid Choice");
		}

		System.out.println("...................Happy Shopping............................");
		scanner.close();
	}

}
