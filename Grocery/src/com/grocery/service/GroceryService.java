package com.grocery.service;

import com.grocery.exception.ItemNotFoundException;
import com.grocery.model.Product;

public interface GroceryService {

	Product[] getByProductName(String productName) throws ItemNotFoundException;

	Product[] getByProductQuantity(int productQuantity) throws ItemNotFoundException;

	Product[] getAll();

	Product getByProductId(int productId) throws ItemNotFoundException;

}
