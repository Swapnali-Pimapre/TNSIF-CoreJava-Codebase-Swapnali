package com.tnsif.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(5.2f);
		System.out.println(p1);
		
		Point p2=new Point(3.4f,5.6f);
		System.out.println(p2);
		
		
		System.out.println("Method Overloading");
		
		System.out.println("Addition of two float number :"+MethodOverloading.add(4.5f,6.5f ));
		
		
		System.out.println("Additon of three numbers :"+MethodOverloading.add(56, 34, 67));
	}

}
