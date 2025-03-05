package com.minku;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void displayProductDetails() {
		System.out.print("Product Details\n");
		System.out.println("---------------");
		System.out.printf("%-16s : %s","Product ID",this.productId);
		System.out.printf("\n%-16s : %s","Product Name",this.productName);
		System.out.printf("\n%-16s : %s","Product Price",this.price);
		System.out.printf("\n%-16s : %s","Product Quantity",this.quantity);
	}
}
