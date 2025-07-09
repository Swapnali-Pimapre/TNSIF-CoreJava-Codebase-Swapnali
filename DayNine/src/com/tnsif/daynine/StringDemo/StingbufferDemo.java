package com.tnsif.daynine.StringDemo;

public class StingbufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string buffer length
		
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println(buffer);
		
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//appending and inserting into bufer
		String s;
		int a=42;
		buffer =new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();

		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer("I java");
		buffer.insert(2, "Love ");
		System.out.println(buffer);
		
		buffer.delete(2, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}

}
