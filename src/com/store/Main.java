package com.store;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Customer Name.:");
		String customerName=sc.nextLine();
		System.out.print("Enter the Phone Number.:");
		String phoneNumber=sc.nextLine();
		System.out.print("Enter the Street Name.:");
		String streetName=sc.nextLine();
		System.out.print("Enter the Bill Amount.:");
		double billAmount=sc.nextDouble();
		System.out.print("Enter the Distance.:");
		int distance=sc.nextInt();
		
		CustomerDetails cd=new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);
		System.out.println("Customer Name.:"+cd.getCustomerName());
		System.out.println("Phone Number.:"+cd.getPhoneNumber());
		System.out.println("Street Name.:"+cd.getStreetName());
		System.out.println("Bonus Points.:"+cd.calculateBonusPoints());
		System.out.println("Delivery Charge.:"+cd.deliveryCharge());

	}

}
