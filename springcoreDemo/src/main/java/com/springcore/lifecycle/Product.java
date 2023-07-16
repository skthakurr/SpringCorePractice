package com.springcore.lifecycle;

public class Product {
	private String productName;
	private int productId;
	
	public Product() {
		super();	
	}
		
	public Product(String productName, int productId) {
		super();
		this.productName = productName;
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		System.out.println("Setting product name");
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("Setting product id");
		this.productId = productId;
	}
	
	public void init() {
		System.out.println("Inside init method : Product");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method : Product");
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + "]";
	}
	
	
}
