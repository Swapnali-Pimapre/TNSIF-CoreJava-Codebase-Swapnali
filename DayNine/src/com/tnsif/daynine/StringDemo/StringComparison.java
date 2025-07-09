package com.tnsif.daynine.StringDemo;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="TNSIF";
		String s2="TNSIF";
		
		
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		System.out.println("Case 1:"+(s1==s2));
		
		System.out.println("Case 2:"+(s2.equals(s1)));
		System.out.println("Case 3:"+(s1==s3));
		System.out.println("Case 2:"+(s2.equals(s4)));
		System.out.println("Case 2:"+(s4==s3));
		System.out.println("Case 2:"+(s3.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compare by using compareto
		
		String n="Radha";
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(n));
		System.out.println(s1.compareToIgnoreCase(n));
		
	}

}
