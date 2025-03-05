package com.vivek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer Name.:");
		String customerName=sc.nextLine();
		System.out.print("Enter Phone Number.:");
		long phoneNumber=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Customer Address.:");
		String address=sc.nextLine();
		System.out.print("Enter Bero Type.:");
		String beroType=sc.nextLine();
		if(beroType.equals("Steel Bero")) {
			System.out.print("Enter Bero Colour.:");
			String beroColor=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter Bero Height.:");
			int beroHeight=sc.nextInt();
			Bero sb=new SteelBero(beroType,beroColor,0.0,beroHeight);
			sb.calculatePrice();
			Discount d=new Discount();
			System.out.println("Discount amount.:"+d.calculateDiscount(sb));
			System.out.println("Price after Discount.:"+sb.getPrice());
		}
		else if(beroType.equals("Wooden Bero")) {
			System.out.print("Enter Bero Colour.:");
			String beroColor=sc.nextLine();
			System.out.print("Enter Wood Type.:");
			String woodType=sc.nextLine();
			Bero wb=new WoodenBero(beroType,beroColor,0.0,woodType);
			wb.calculatePrice();
			Discount d=new Discount();
			System.out.println("Discount amount.:"+d.calculateDiscount(wb));
			System.out.println("Price after Discount.:"+wb.getPrice());
		}
		else {
			System.out.println("Invalid Bero Type");
		}
	
	}

}
