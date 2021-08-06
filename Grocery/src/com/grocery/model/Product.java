package com.grocery.model;

public class Product {
	
	private long productId;
	private String productName;
	private int productQuantity;
	private double productPrice;
	public Product(long productId, String productName, int productQuantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = price;
	}
	@Override
	public String toString() {
		
		return "ProductId : " + productId + "\nProductName : " + productName + "\nProductQuantity : " + productQuantity+ "\nproductPrice : " + productPrice + "\n--------------------------";
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long serialNo) {
		this.productId = serialNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String brandName) {
		this.productName = brandName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
}
