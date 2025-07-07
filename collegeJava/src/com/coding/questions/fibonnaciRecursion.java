package com.coding.questions;

import java.util.Scanner;

public class fibonnaciRecursion {

	public static int fibbo(int n) {
		if(n<=1)
			return n;
		return fibbo(n-1)+fibbo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the term length");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(fibbo(n));
		 for (int i = 0; i < n; i++) {
	            System.out.print(fibbo(i) + " ");
	        }

	}

}
