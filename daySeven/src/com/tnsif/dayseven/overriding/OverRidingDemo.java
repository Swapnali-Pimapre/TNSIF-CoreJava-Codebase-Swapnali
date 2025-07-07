package com.tnsif.dayseven.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rbi;
		
		//dynamic binding assigning child object to parent 
		
		
		rbi=new RBI();
		
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi =new HDFC();
		System.out.println(rbi.getRateofInterest());
	}

}
