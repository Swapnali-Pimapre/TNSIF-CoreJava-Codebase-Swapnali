package com.coding.questions;

import java.util.Scanner;

public class DelloitCoronavirus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a N value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the elements of array");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();	
			 }
		 System.out.println("Enter number of spikes");
		 int spike=sc.nextInt();
		 int result=0;
		 for(int i=0;i<n;i++) {
			 result=(arr[i]>>spike);
			 arr[i]=result;
			 System.out.println(arr[i]+" ");
		 }
	}

}
