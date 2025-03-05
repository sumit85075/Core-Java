package com.magic.sum;

import java.util.Scanner;

public class MagicSum {
	
	public static void magicSum(int arr[],int size) {
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=1;j<=arr[i];j++) {
				int a=1,b=0;
				while(a<=j) {
					if(j%a==0) {
						b++;
					}
					a++;
				}
				if(b==2) {
					sum+=j;
				}
				if(sum==arr[i]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array between 1 to 5.:");
		int size=sc.nextInt();
		int arr[] = null;
		if(size>0 && size<=5) {
			arr=new int[size];
			System.out.print("Enter "+size+" element in an Array between 1 to 100.:");
			for(int i=0;i<size;) {
				int n=sc.nextInt();
				if(n>0 && n<=100) {
					arr[i]=n;
					i++;
				}
			}
		}
		else {
			System.out.println("Array size is Invalid");
		}
		
		magicSum(arr,size);

	}

}
