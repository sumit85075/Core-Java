package edu.srm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student ID.:");
		int studentId=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student Name.:");
		String studentName=sc.nextLine();
		System.out.print("Enter Department.:");
		String department=sc.nextLine();
		System.out.print("Enter Student Gender.:");
		String gender=sc.nextLine();
		System.out.print("Enter Student Category.:");
		String category=sc.nextLine();
		System.out.print("Enter College Fee.:");
		double collegeFee=sc.nextDouble();
		if(category.equals("DayScholar")) {
			System.out.print("Enter Bus Number.:");
			int busNumber=sc.nextInt();
			System.out.print("Enter the Distance.:");
			float distance=sc.nextFloat();
			Student ds=new DayScholar(studentId,studentName,department,gender,category,collegeFee,busNumber,distance);
			System.out.println("Total College Fee is "+ds.calculateTotalFee());
		}
		else if(category.equals("Hosteller")) {
			System.out.print("Enter the Room Number.:");
			int roomNumber=sc.nextInt();
			System.out.print(" Enter the Block Name.:");
			char blockName=sc.next().charAt(0);
			System.out.print(" Enter the Room Type.:");
			String roomType=sc.nextLine();
			Student h=new Hosteller(studentId,studentName,department,gender,category,collegeFee,roomNumber,blockName, roomType);
			System.out.println("Total College Fee is "+h.calculateTotalFee());
		}

	}

}
