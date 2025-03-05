package com.minku;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product ID.:");
		int productId=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Product Name.:");
		String productName=sc.nextLine();
		System.out.print("Enter Product Price.:");
		double price=sc.nextDouble();
		System.out.print("Enter Product Quantity.:");
		int quantity=sc.nextInt();
		Product p=new Product(productId, productName, price,quantity);
		p.displayProductDetails();
	}

}
