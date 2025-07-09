package com.tnsif.daynine.StringDemo;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[]= {'I','n','d','i','a'};
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		
		//concatenation
		///  /t provides 6 spaces
		String longstr="This is to show "+"how long sentence can be/t"+" Printed";
		System.out.println(longstr);
		
		String str=new String(" India ");
		System.out.println(str);
		String str2=str.toLowerCase();
		System.out.println(str2);
		
		String s3=str.toUpperCase();
		System.out.println(s3);
		
		
		int len=str.length();
		System.out.println(len);
		
		String s4=s1.substring(1,5);
		System.out.println(s4);
		
		String a="   radha  ";
		System.out.println(a.trim());
		System.out.println(a.stripTrailing());
		
		System.out.println(a.strip());
		
		System.out.println(a.isEmpty());
		
		s2=new String(str);
		str2=" India ";
		
		String str3=new String(" India ");
		
		System.out.println(str2.equals(s2));
		
		System.out.println(str2.equals(str3));
		
		System.out.println(str2==str3);
	}

}
