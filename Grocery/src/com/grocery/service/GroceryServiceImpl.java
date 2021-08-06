package com.grocery.service;

import com.grocery.exception.ItemNotFoundException;
import com.grocery.model.Product;

public class GroceryServiceImpl implements GroceryService {

	@Override
	public Product[] getByProductName(String productName) throws ItemNotFoundException {
		Product[] products = getAllProducts();
		int index = 0;
		int flag = 0;
		Product[] productByName = new Product[10];
		for (Product product : products) {
			if (product.getProductName().equals(productName)) {
				productByName[index++] = product;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new ItemNotFoundException("Sorry!!This Product is Out of Stock");
		}
		return productByName;
	}

	@Override
	public Product[] getByProductQuantity(int productQuantity) throws ItemNotFoundException {
		Product[] products = getAllProducts();
		int index = 0;
		int flag = 0;
		Product[] productByQuantity = new Product[10];
		for (Product product : products) {
			if (product.getProductQuantity() == productQuantity) {
				productByQuantity[index++] = product;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new ItemNotFoundException("Sorry!!This Product is Out of Stock");
		}
		return productByQuantity;
	}

	@Override
	public Product[] getAll() {
		return getAllProducts();
	}

	@Override
	public Product getByProductId(int productId) throws ItemNotFoundException {
		Product[] products = getAllProducts();
		for (Product product : products) {
			if (product.getProductId() == productId) {
				return product;
			}
		}
		throw new ItemNotFoundException("Sorry!!This Product is Out of Stock");
	}

	private Product[] getAllProducts() {
		Product[] products = new Product[21];
		products[0] = new Product(101, "Oil", 3, 759);
		products[1] = new Product(102, "Rice", 20, 200);
		products[2] = new Product(103, "Brown Rice", 2, 300);
		products[3] = new Product(104, "Nuts", 2, 1200);
		products[4] = new Product(105, "Dried Fruits", 2, 600);
		products[5] = new Product(106, "Eggs", 50, 166);
		products[6] = new Product(107, "Detergent", 1, 180);
		products[7] = new Product(108, "Noodles", 8, 35);
		products[8] = new Product(109, "Sugar", 2, 60);
		products[9] = new Product(110, "Jaggery", 7, 23);
		products[10] = new Product(111, "Turmeric powder", 10, 12);
		products[11] = new Product(112, "Basmati rice", 20, 800);
		products[12] = new Product(113, "Chips", 2, 20);
		products[13] = new Product(114, "Chocolates", 2, 60);
		products[14] = new Product(115, "Bread", 2, 29);
		products[15] = new Product(116, "Brown Bread", 50, 39);
		products[16] = new Product(117, "Soaps", 1, 101);
		products[17] = new Product(118, "Pasta", 8, 35);
		products[18] = new Product(119, "Sauces", 2, 199);
		products[19] = new Product(120, "Salad Dressings", 7, 149);
		products[20] = new Product(121, "Red-wine vineger", 7, 212);
		return products;
	}

}
