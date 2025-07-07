package com.coding.questions;

import java.util.Scanner;

public class DelloitRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of n student");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		
		System.out.println("Enter values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int cut=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				cut++;
			}
		}
		System.out.println("No of cuts: "+cut);

	}

}
