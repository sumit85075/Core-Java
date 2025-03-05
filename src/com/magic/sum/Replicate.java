package com.magic.sum;

import java.util.*;
import java.util.Scanner;

public class Replicate {

	public static String getDuplicateElement(int arr[], int n) {
		if(n>arr.length) {
			System.out.print(arr[n]);
			return null;
		}
		System.out.println("Array element after Replicate.......");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[n]);
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the size of Array.:");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.print("Enter " + size + " element in an Array .:");
			for (int i = 0; i < size; i++) {
				arr[i] =sc.nextInt();
			}
			System.out.print("Enter the position to Replicate the value.:");
			int n = sc.nextInt();
			getDuplicateElement(arr, n);
		} 
		catch (NegativeArraySizeException e) {
			System.out.println("Array size should be positive");	
		}
		
		catch (InputMismatchException e) {
			System.out.println("Input was not in the correct format");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of range");
		}

	}
}
