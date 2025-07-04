package com.tnsif.daysix.finalDemo;

public class FinalMethodClass {
	
	public FinalMethodClass() {
		System.out.println("This is a default constructor");
	}
	
	final int a=34;
	
	final void show() {
		System.out.println("Value of a "+a);
	}

}
