package com.tnsif.dayEight.abstractionClassDemo;

public class Rectangular extends Shape{

	float width;
	float height;
	public Rectangular() {
		width=3.2f;
		height=3.5f;
		
	}
	public Rectangular(float width, float height) {
		
		this.width = width;
		this.height = height;
	}
	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=width*height;
	}
	
	
}
