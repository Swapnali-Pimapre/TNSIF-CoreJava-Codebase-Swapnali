package com.tnsif.dayEight.abstractionClassDemo;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;
		s=new Square();
		s.calArea();
		s.show();
		
		s=new Rectangular();
		s.calArea();
		s.show();
		
		s=new Square(5.6f);
		s.calArea();
		s.show();
		
		s=new Rectangular(8.5f,96.5f);
		s.calArea();
		s.show();
	}

}
