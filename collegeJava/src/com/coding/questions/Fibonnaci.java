package com.coding.questions;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the nth term");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ft=0;
		int st=1;
		System.out.println(ft);
		System.out.println(st);
		for(int i=0;i<n;i++) {
			int tt=ft+st;
			ft=st;
			st=tt;
			System.out.println(tt);
		}
	}

}
