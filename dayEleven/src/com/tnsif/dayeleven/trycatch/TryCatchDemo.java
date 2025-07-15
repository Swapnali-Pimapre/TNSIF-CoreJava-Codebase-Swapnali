package com.tnsif.dayeleven.trycatch;

class TryCatchException{
	static void perfornDivision(int x,int y) {
		System.out.println("I am in method");
		try {

			System.out.println("I am in try block");
			int z=x/y;
			System.out.println("Result of z:"+z);
			
		}
		catch(ArithmeticException e){
			System.out.println("I am in catch block :"+e.getMessage());
		}
	}
}
public class TryCatchDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchException.perfornDivision(1, 0);
		TryCatchException.perfornDivision(87, 96);
		TryCatchException.perfornDivision(89, 0);
		
	}

}
