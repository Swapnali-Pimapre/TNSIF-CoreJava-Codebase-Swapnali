package com.tnsif.dayseven.overriding;

public class ICICI extends RBI {
	
	public float getRateofInterest() {
		System.out.println("Base rate of Interest of home loan");
		return 6.7f;
	}

}
