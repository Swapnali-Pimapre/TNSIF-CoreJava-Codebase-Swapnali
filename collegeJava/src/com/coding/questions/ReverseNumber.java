package com.coding.questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		while(n>0) {
			int last=n%10;
			reverse=reverse*10+last;
			n=n/10;
		}
		System.out.println(reverse);
	}

}
