package com.tnsif.daynine.StringDemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
		
		//without using int value
		
		int c=i;
		System.out.println(c);
		
		//Autoboxing
		
		int a=100;
		Integer s=a;
		System.out.println(s);
	}

}
