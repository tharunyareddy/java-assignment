package com.grocery.service;

import com.grocery.exception.ItemNotFoundException;
import com.grocery.model.Product;

public class GroceryServiceImpl implements GroceryService {

	@Override
	public Product[] getByProductName(String productName) throws ItemNotFoundException{
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
	public Product[] getByProductQuantity(int productQuantity) throws ItemNotFoundException{
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
	public Product getByProductId(int productId) throws ItemNotFoundException{
		Product[] products = getAllProducts();
		for (Product product : products) {
			if (product.getProductId() == productId) {
				return product;
			}
		}
		throw new ItemNotFoundException("Sorry!!This Product is Out of Stock");
	}
	
	private Product[] getAllProducts() {
		Product[] products = new Product[10];
		products[0] = new Product(101, "Oil", 10, 500);
		products[1] = new Product(102, "Rice", 20, 560);
		products[2] = new Product(103, "Brown Rice", 2, 490);
		products[3] = new Product(104, "Nuts", 2, 490);
		products[4] = new Product(105, "Dried Fruits", 2, 490);
		products[5] = new Product(106, "Eggs", 50, 490);
		products[6] = new Product(107, "Detergent", 1, 490);
		products[7] = new Product(108, "Noodles", 8, 490);
		products[8] = new Product(109, "Sugar", 2, 490);
		products[9] = new Product(110, "Jaggery", 7, 490);
		return products;
	}

}
