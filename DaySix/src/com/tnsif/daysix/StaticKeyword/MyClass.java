package com.tnsif.daysix.StaticKeyword;

public class MyClass {
	
	
	private int section;
	
	private static int srNo;
	
	static {
		System.out.println("------within static block-------");
		srNo=1000;
		//section=343  error will occured we can not assign value to non static block
	}

	public MyClass() {
		
		System.out.println("--------Within default constructor------");
		
		srNo++;
		
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial no ="+srNo+",section=" + section + "]";
	}
	
	//static method
	
	static void display() {
		//System.out.println("Section :"+section);  error bcoz noon static variable can not be accesed by static method
		System.out.println("Serial no :"+srNo);
	}
	
	

}
