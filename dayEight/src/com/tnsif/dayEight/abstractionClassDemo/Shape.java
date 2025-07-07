package com.tnsif.dayEight.abstractionClassDemo;

public abstract class Shape {
	
	protected float area;
	//abstract method
	public abstract void calArea();
	
	//solid method or concrete method
	
	public void show() {
		System.out.println("Area of shape is :"+area);
	}

}
